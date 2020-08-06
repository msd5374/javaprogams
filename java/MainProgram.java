package com.dac.java;

import java.util.Scanner;

public class MainProgram {
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		System.out.println("Enter the a & b : ");
		
		Scanner scanner = new Scanner(System.in) ;
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int result = calc.sum(a, b);
		int subValue = calc.sub(a, b);
		int powValue = calc.power(a, b);
		
		System.out.println("Sum of a & b is :"+result);
		System.out.println("Power of a & b  is :: "+powValue);
		
	}

}