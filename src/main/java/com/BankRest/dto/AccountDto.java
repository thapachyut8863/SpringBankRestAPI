package com.BankRest.dto;

import lombok.Data;

@Data
public class AccountDto {
	private Long Id;
	private String accountHolderName;
	private double balance;
	
	public AccountDto() {
		
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public AccountDto(Long id, String accountHolderName, double balance) {
		super();
		Id = id;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	
	

}
