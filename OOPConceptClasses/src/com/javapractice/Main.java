package com.javapractice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * BankAccount myAccount = new BankAccount();
		 * 
		 * System.out.println(myAccount.getBalance()); myAccount.depositFunds(2000);
		 * System.out.println(myAccount.getBalance()); myAccount.withdrawFunds(2001);
		 * System.out.println(myAccount.getBalance());
		 */
		
		VipCustomer hdfc = new VipCustomer("Tim", 200);
		System.out.println(hdfc.getName());
		System.out.println(hdfc.getCreditLimit());
		System.out.println(hdfc.getEmail());
		
		
		
	}

}
