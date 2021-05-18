package com.cg.customer.exception;

public class InvalidCustomerAgeException extends RuntimeException{
	public InvalidCustomerAgeException(String msg){
        super(msg);
    }
}
