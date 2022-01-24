package com.javapractice;

public class VipCustomer {

	private String name;
	private float creditLimit;
	private String email;
	
	public VipCustomer() {
		this("default name", 10000, "unknown@email");
	}
	
	public VipCustomer(String name, float creditLimit, String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}
	
	public VipCustomer(String name, float creditLimit) {
		this(name,creditLimit,"default-email");
		
	}

	public String getName() {
		return name;
	}

	
	public float getCreditLimit() {
		return creditLimit;
	}

	

	public String getEmail() {
		return email;
	}

	
	
	
}
