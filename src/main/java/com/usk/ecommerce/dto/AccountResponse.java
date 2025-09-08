package com.usk.ecommerce.dto;

public class AccountResponse {
	
	
    private String accountNumber;
	
	private Double balance;

	public AccountResponse(String accountNumber, Double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public AccountResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	
	
	


}
