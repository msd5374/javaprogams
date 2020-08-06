package com.dac.java.bank;

public class Account {
	
	private String name;
	private int acntNo;
	private int balance;
	
	public Account() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAcntNo() {
		return acntNo;
	}

	public void setAcntNo(int acntNo) {
		this.acntNo = acntNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", acntNo=" + acntNo + ", balance=" + balance + "]";
	}
	
}
