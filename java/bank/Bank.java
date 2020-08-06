package com.dac.java.bank;

import java.util.ArrayList;
import java.util.Iterator;

public class Bank {
	
	String bankName;
	String branchName;
	ArrayList<Account> accounts;
	private static int BASE_ACNT_NO = 1000;
	
	public Bank() {
		accounts = new ArrayList<>();
	}
	
	public int createAccount(String name) {
		Account account = new Account();
		account.setName(name);
		account.setBalance(0);
		account.setAcntNo(BASE_ACNT_NO);
		BASE_ACNT_NO++;
		
		accounts.add(account);
		return account.getAcntNo(); 
	}
	
	public int deposit(int acntNo, int amount) {
		for(int i=0;i<accounts.size();i++) {
			Account acntObj = accounts.get(i);
			if(acntObj.getAcntNo() == acntNo) {
				int oldBalance = acntObj.getBalance();
				acntObj.setBalance(oldBalance + amount);
				return acntObj.getBalance(); 
			}
		}
		return -1;
	}
	
	public int withdraw(int acntNo,int amount) {
		for( int i=0;i<accounts.size();i++) {
			Account acntObj = accounts.get(i);
			if(acntObj.getAcntNo() == acntNo) {
				if(acntObj.getBalance() < amount)
					return -2; //insufficient balance
				else {
					int balance = acntObj.getBalance();
					acntObj.setBalance(balance - amount);
					return acntObj.getBalance();
				}
			}
		}
		return -1; //invalid acnt no
	}
	
	public void displayAllAccounts() {
		Iterator<Account> iterator = accounts.iterator();
		while( iterator.hasNext() ) {
			System.out.println( iterator.next() );
		}
	}
	
	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}
}