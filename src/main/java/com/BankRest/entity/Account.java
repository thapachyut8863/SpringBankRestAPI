package com.BankRest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "accounts")
@Entity

public class Account {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long Id;
	@Column(name = "account_holder_name")
	private String accountHolderName;
	@Column(name = "balance")
	private double balance;
	
	public Account() {
		
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
	public Account(Long id, String accountHolderName, double balance) {
		super();
		Id = id;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	

}
