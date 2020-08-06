package com.dac.java.bank;

import java.util.Scanner;

public class MainProgram {
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		bank.setBankName("HDFC");
		bank.setBranchName("Andheri");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the account user name :: ");
		String name1 = scanner.nextLine();
		
		int acntNo1 = bank.createAccount(name1);
		System.out.println("Account is created successfully -- "+acntNo1);
		
		System.out.println("Enter another account user name : ");
		String name2 = scanner.nextLine();
		int acntNo2 = bank.createAccount(name2);
		System.out.println("New Account is created :: "+acntNo2);
		
		System.out.println("Enter the amount to deposit : ");
		int depositAmout = scanner.nextInt();
		int balance = bank.deposit(acntNo1, depositAmout);
		System.out.println("Updated Balance is : "+balance);
		
		System.out.println("Ënter the amount to withdraw : ");
		int withdrawAmount = scanner.nextInt();
		balance = bank.withdraw(acntNo1, withdrawAmount);
		System.out.println("Updated Balance is : "+balance);
		
		System.out.println("All the accounts : ");
		bank.displayAllAccounts();
		
		
	}
}