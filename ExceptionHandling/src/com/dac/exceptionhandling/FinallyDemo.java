package com.dac.exceptionhandling;

public class FinallyDemo {
	
	public static void main(String[] args) {
		convert();
	}
	
	public static void convert() {
		try {
			String str = "ten";
			int i = Integer.parseInt(str);
			System.out.println("Value is :: "+i);
		}catch(Exception exception) {
			System.out.println("Exceptio :: Invalid input");
		}finally {
			//optional block
			System.out.println("Finally block is called");
		}
	}
}
