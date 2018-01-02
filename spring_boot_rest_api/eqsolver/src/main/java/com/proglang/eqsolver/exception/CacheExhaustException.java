package com.proglang.eqsolver.exception;

public class CacheExhaustException  extends Exception{
	String message;
	
	
	public CacheExhaustException(String exception) {
		this.message=exception;
	
	}

	@Override 
	public String getMessage() {
		return this.message;
	}
}
