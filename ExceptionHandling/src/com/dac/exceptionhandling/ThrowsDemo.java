package com.dac.exceptionhandling;

public class ThrowsDemo {
	
	public static void main(String[] args) {
		int output = 0;
		try {
			System.out.println("Parsing started");
			output = parsing("ten");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Output is : "+output);
	}
	
	public static int parsing(String str) throws Exception{
		int i = Integer.parseInt(str);
		return i;
	}

}