package com.example.cnExpense.ExceptionHandling;

public class NotFoundException extends RuntimeException{

	public NotFoundException(String msg) {
		super(msg);
	}
}
