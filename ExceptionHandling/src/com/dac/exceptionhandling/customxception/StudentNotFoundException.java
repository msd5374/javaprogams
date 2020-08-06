package com.dac.exceptionhandling.customxception;

public class StudentNotFoundException extends Exception{
	public StudentNotFoundException() {
		super("Student Not Found !!!");
	}
}
