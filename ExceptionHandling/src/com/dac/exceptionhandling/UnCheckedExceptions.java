package com.dac.exceptionhandling;

import javax.swing.text.NumberFormatter;

public class UnCheckedExceptions {
	
	public static void main(String[] args) {
		//indexOutOfBoundExcepion();
		try {
			numberFormatException();	
		}
		catch(NumberFormatException ne) {
			System.out.println("Exception at main program");
		}
		System.out.println("End of the program");
	}

	public static void indexOutOfBoundExcepion() {
		int array[] = new int[10];
		
		try {
			array[5] = 101;
			System.out.println(array[5]);
			
			String s =null;
			System.out.println(s.length());
			
		}catch(NullPointerException ae) {
			System.out.println("Null Pointer Exception");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index out of bound");
		}catch(ArithmeticException ame) {
			System.out.println("Airhtmetic Exception");
		}
		
		System.out.println("End of the method");
	}
	
	public static void numberFormatException() throws NumberFormatException{
		String str = "ten";
		int value =  Integer.parseInt(str);
		System.out.println("The value is :: "+value);	
		//debit from the bank account
		//update the new balance
		System.out.println("End of the method");
	}
}
