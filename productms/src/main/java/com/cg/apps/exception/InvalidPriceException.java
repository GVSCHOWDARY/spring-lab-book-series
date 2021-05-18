package com.cg.apps.exception;

public class InvalidPriceException extends RuntimeException {
	public InvalidPriceException(String msg) {
		super(msg);
	}
}
