package com.BankRest.service;

import com.BankRest.dto.AccountDto;

public interface AccountService {
	AccountDto createAccount(AccountDto accountDto);
	AccountDto getAccountById(Long Id);

}
