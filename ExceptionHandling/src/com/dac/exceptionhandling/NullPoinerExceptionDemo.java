package com.dac.exceptionhandling;

public class NullPoinerExceptionDemo {
	public static void main(String[] args) {
		
		//String str=null; //no memory allocated
	//String str = new String("Hello"); //memory created for "Hello"
		

                              
		//handle with logic
		/*if( str == null)
			System.out.println("The given string is null");
		else
			System.out.println("Length is : "+str.length());*/	
		
		//handle with try catch
		try {
			System.out.println("Length is : "+str.length());
		}catch(NullPointerException exception) {
			String message = exception.getMessage();
			System.out.println("The given string is null -- message is-- "+message);
			exception.printStackTrace();
		}
		
		System.out.println("End of the program");
		
	}

}
