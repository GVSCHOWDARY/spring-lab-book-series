package com.cg.customer.exception;

public class invalidCustomerNameException extends RuntimeException {
	public invalidCustomerNameException(String msg){
        super(msg);
    }
}
