package com.BankRest.service;

import com.BankRest.dto.AccountDto;

public interface AccountService {
	AccountDto createAccount(AccountDto accountDto);
	AccountDto getAccountById(Long Id);
	AccountDto deposit(Long id , double amount);
	AccountDto withdrawl(Long id, double amount);

}
