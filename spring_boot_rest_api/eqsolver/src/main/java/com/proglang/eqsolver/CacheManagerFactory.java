package com.proglang.eqsolver;

public class CacheManagerFactory {

	static CacheManagerFactory factory = null;
	
	private CacheManagerFactory() {
		// Make a constructor private so that no one else can create
		// another instance of factory
	}
	
	static public CacheManagerFactory getInstance() {
		if (null == factory) {
			factory= new CacheManagerFactory();
		}
		
		return factory;
	}
	
	public DataResultCache getDataResultCache() {
		return new DataResultCache();
	}
	
}
