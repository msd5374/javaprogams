package com.dac.exceptionhandling;

public class StringExceptionDemo {
	
	public static void main(String[] args) {
		
		try {
			String str = "java program";
			char c = str.charAt(400);
			//System.out.println(str.length());
			System.out.println("Char value is :: "+c);	
		}catch(StringIndexOutOfBoundsException se) {
			System.out.println("String index not found");
		}catch (RuntimeException re) {
			System.out.println("Runtime Exception");
		}catch(Exception e) {
			System.out.println("Exception");
		}
		System.out.println("Out of try block");
	}
}