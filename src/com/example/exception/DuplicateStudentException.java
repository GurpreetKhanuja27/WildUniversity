package com.example.exception;


//Checked Exception
public class DuplicateStudentIdException extends Exception{

	
	public DuplicateStudentIdException(String msg) {
		super(msg);
	}
}
