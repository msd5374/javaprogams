package com.dac.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionDemo {
	
	public static void main(String[] args) {
		System.out.println("Hello!");
		try {
			File file = new File("C:\\profile.ini");
			FileReader fileReader = new FileReader(file);
			System.out.println("File is read!");
		}catch(FileNotFoundException e) {
			System.err.println("File is not found!");
		}
	}
}