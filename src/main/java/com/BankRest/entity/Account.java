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

}
