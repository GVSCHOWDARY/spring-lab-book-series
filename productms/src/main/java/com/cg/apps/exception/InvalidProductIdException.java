package com.cg.apps.exception;

public class InvalidProductIdException extends RuntimeException {
	public InvalidProductIdException(String msg) {
		super(msg);
	}
}
