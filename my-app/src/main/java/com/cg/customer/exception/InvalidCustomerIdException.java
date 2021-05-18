package com.cg.customer.exception;

public class InvalidCustomerIdException extends RuntimeException{
	public InvalidCustomerIdException(String msg){
        super(msg);
    }
}
