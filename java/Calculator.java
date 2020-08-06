package com.dac.java;

public class Calculator {

	public int sum(int a,int b) {
		int c = a + b;
		return c;
	}
	
	public int sub(int a,int b) {
		int c = a - b;
		return c;
	}
	
	public int power(int x,int y) {
		int result = 1;
		for( int i =0; i<y; i++)
			result = result * x;
		return result;
	}
	
}
