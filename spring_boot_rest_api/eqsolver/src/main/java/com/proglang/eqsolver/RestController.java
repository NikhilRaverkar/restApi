package com.proglang.eqsolver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.proglang.eqsolver.exception.CacheExhaustException;
import com.proglang.eqsolver.pojo.FileInfo;

@org.springframework.web.bind.annotation.RestController
@EnableAutoConfiguration
public class RestController {
	
	static String UPLOAD_DIR_PATH = "/Users/vipulchaskar/cs571/Proj/python/uploads";
	static String PYTHON_EXECUTABLE_PATH = "python";
	static String OCR_SCRIPT_PATH = "/Users/vipulchaskar/cs571/Proj/python/ocr.py";
	static String INTERNAL_SERVER_ERROR = "Internal Server Occurred on Server";
	
	static DataResultCache dataCache = new DataResultCache();
	Map<String,String> data = new HashMap<>();
	@RequestMapping("/")
	public String init() {
		return "HELLO";
	}
	
	@RequestMapping(value = {"/solve"}, method = RequestMethod.POST)
	public String uploadFile(@RequestParam("file") MultipartFile  file) {
		
		String uploadLocation = UPLOAD_DIR_PATH;
		uploadLocation += File.separator + file.getOriginalFilename();

		String returnResult = null;
		String line= null;
		StringBuilder sb = new StringBuilder();

		try {
			// Save the contents of the image file received from client and calculate its MD5 hash
			FileInfo fileInfo = writeToFile(file.getInputStream(), uploadLocation);
			
			// Check if the result for the same file is present in the cache.
			// If the result is present in cache, there is no need to call OCR module
			String result = CacheManagerFactory.getInstance().getDataResultCache().
					getResult(fileInfo.getMd5Hash());
			if (null == result) {				
				// If the result is not found in the cache, we have to call OCR module to further process the image

				Process ocrModule = Runtime.getRuntime().exec(
						PYTHON_EXECUTABLE_PATH + " " +
						OCR_SCRIPT_PATH + " " +
						"-i" + " " +
						UPLOAD_DIR_PATH + File.separator +
						file.getOriginalFilename());

				// Wait for the python OCR module to finish working.
				ocrModule.waitFor();
				
				// OCR module writes the result of expression evaluation to the standar output.
				// Read the result of evaluation from the standard output
				BufferedReader buffer = new BufferedReader(new InputStreamReader(ocrModule.getInputStream()));
				while (((line= buffer.readLine())!=null)) {
					sb.append(line);				
				}

				result = sb.toString();
				System.out.println(result);

				// As the result was not cached, add the result of expression evaluation along with the file
				// MD5 hash into the cache.
				try {
					CacheManagerFactory.getInstance().getDataResultCache().add(fileInfo.getMd5Hash(), result);
				} catch (CacheExhaustException e) {
					// Don't return error to client if the cache is full
					e.printStackTrace();
				}
				
				returnResult = Util.html1 + result + Util.html2 ;
			}else {
				// If the result of expression evaluation is found in the cache, return it.
				returnResult = Util.html1 + result + Util.html2 ;
			}
		} catch (IllegalStateException e) {
			e.printStackTrace();
			returnResult = INTERNAL_SERVER_ERROR;
		} catch (IOException e) {
			e.printStackTrace();
			returnResult = INTERNAL_SERVER_ERROR;
		} catch (InterruptedException e) {
			e.printStackTrace();
			returnResult = INTERNAL_SERVER_ERROR;
		}
		
		return returnResult;
	}
	
	private FileInfo writeToFile(InputStream uploadedInputStream,
			String uploadedFileLocation) {

		try {

			File newFile = new File(uploadedFileLocation);
			FileOutputStream outStream = new FileOutputStream(newFile);
		
			// Create the instance of Message Digest class so as to return the path
			// of the saved image file and calculated hash of the file
			FileInfo fileInfo = new FileInfo();

			// Create an instance of digest to calculate MD5 of the received image
			MessageDigest msgDigest = MessageDigest.getInstance("MD5");
			msgDigest.reset();

			int read = 0;
			byte[] bytes = new byte[1024];

			// Read the incoming file data in the chunks of 1024 bytes at a time until
			// all the data read.
			read = uploadedInputStream.read(bytes);
			while (read != -1) {
				outStream.write(bytes, 0, read);
				
				// Insert the read bytes into the instance of message digest
				msgDigest.update(bytes);
				
				// Read next set of 1024 bytes from input if available
				read = uploadedInputStream.read(bytes);
			}
			
			// All the data has been updated into the message digest. So, calculate the MD5
			// of the received image file
			byte[] digest = msgDigest.digest();
			
			// Convert the data into BigInteger so that it can be converted into String format
			BigInteger bigInt = new BigInteger(1, digest);

			// Convert the MD5 into string format which will be used as a key to store image result
			// in the cache.
			String fileMD5 = bigInt.toString(16);
			
			System.out.println("MD5 Hash: " + fileMD5);

			// FLush all the data in the output stream to the local file
			outStream.flush();
			
			// Close the file
			outStream.close();
			
			// Update the location where the file is saved which will be used to pass
			// as an argument to the python module.
			fileInfo.setFilePath(uploadedFileLocation);

			// Update the MD5 hash of the file which will be used as a key to store the result of the
			// mathematical expression in the cache.
			fileInfo.setMd5Hash(fileMD5);

			return fileInfo;
		} catch (IOException e) {

			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
	
	/* @RequestMapping(value = {"/solve"}, method = RequestMethod.POST)
	 public String uploadFile(){
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@FormDataParam("file") InputStream uploadedInputStream,
	@FormDataParam("file") FormDataContentDisposition fileDetail) {

	String uploadedFileLocation = "G:\\Java\\PL\\file_repo\\" + fileDetail.getFileName();

	// save it
	FileInfo result = writeToFile(uploadedInputStream, uploadedFileLocation);

	String output = "File uploaded to : " + uploadedFileLocation;*/

	
//}
	
	
}
