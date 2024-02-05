package com.example.classex;

public class BankMethods {

	static int curentBalance = 15000; 
	public static void greetCustomer() {
		System.out.println("Hi ! Welcome to the bank");
	}
	public void  getBalance() {
		  System.out.println("The current balance is" +curentBalance); 
	}
	
	public void deposit(int amount) {
		curentBalance= curentBalance + amount;
		
		System.out.println("amount deposited " +amount);
	}
	
	public static void withdrawl(int amount) {
		curentBalance= curentBalance - amount;
		System.out.println("the added amount =>" +curentBalance);
	}
	
	public int  getCurrentBalance() {
		return  curentBalance;
	}
	
	public static void main(String[] args) {
		greetCustomer();
		
		BankMethods bm = new BankMethods();
		bm.getBalance();
		bm.deposit(1000);
		bm.getCurrentBalance();
		withdrawl(1000);
		
	}

}
