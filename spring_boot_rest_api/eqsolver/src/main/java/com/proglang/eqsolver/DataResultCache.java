package com.proglang.eqsolver;

import java.util.HashMap;
import java.util.Map;

import com.proglang.eqsolver.exception.CacheExhaustException;

public class DataResultCache {
	
	// Cache for maintaining the result of solved equation
	static Map<String, String> dataCache = null;
	
	static long maxCapacity = Long.MAX_VALUE;
	
	public DataResultCache() {
		if(null==dataCache) {
			
			// Create a new cache only if it is not created
			dataCache = new HashMap<>();
		}
	}
	
	public Map<String, String> getDataCache() {
		return dataCache;
	}
	
	public void setDataCache(Map<String, String> tempDataCache) {
		dataCache = tempDataCache;
	}
	
	public void add(String md5Hash, String result) throws CacheExhaustException {
		// Check if the cache limit has reached. If yes, throw an exception
		if(dataCache.size()>=maxCapacity) {
			throw new CacheExhaustException("Server cache overflow");
		}
		
		if (null != md5Hash && null != result) {
			dataCache.put(md5Hash, result);
		}
	}
	
	public String getResult(String md5Hash) {
		return dataCache.get(md5Hash);
	}
	
	public void delete(String md5Hash) {
		dataCache.remove(md5Hash);
	}

}
