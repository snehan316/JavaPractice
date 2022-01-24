package com.javapractice;

public class BankAccount {

	 	private String accountNumber;
	 	private float balance;
	 	private String customerName;
	 	private String email;
	 	private int phoneNumber;
	 	
	 	
		public String getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}
		public float getBalance() {
			return balance;
		}
		public void setBalance(float balance) {
			this.balance = balance;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(int phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
	 	
		
		public void depositFunds(float depositAmount) {
			this.balance+= depositAmount;
		}
		
		public void withdrawFunds(float withdrawalAmount) {
			if(this.balance <=0 || (balance-withdrawalAmount) <0 ) {
				System.out.println("Insufficient funds");
			}else {
				this.balance-=withdrawalAmount;
			}
		}
	 	
	 	
	
	
	
}
