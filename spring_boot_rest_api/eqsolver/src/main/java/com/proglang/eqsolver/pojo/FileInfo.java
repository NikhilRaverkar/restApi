package com.proglang.eqsolver.pojo;

public class FileInfo {

	private String filePath;
	private String md5Hash;
	
	public String getMd5Hash() {
		return md5Hash;
	}
	public void setMd5Hash(String md5Hash) {
		this.md5Hash = md5Hash;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
}
