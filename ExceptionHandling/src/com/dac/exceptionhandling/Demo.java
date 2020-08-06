package com.dac.exceptionhandling;

public class Demo {
	
	public static void main(String[] args) {
		divide();
	}
	
	public static void divide() {
		int a = 10;
		int b = 10;
		int result = 0;
		
		System.out.println("Calculating the division");
		try {
			result = a/b;
			System.out.println("The result is :: "+result);
			
			
			
			
			System.out.println("End of try");
		}catch(ArithmeticException e) {
			System.out.println("Exception ocured.");
		}
		//executes the rest of the program
		
		System.out.println("End of the program");		
	}

}
