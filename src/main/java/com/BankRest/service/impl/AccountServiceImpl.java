package com.BankRest.service.impl;

import org.springframework.stereotype.Service;

import com.BankRest.dto.AccountDto;
import com.BankRest.entity.Account;
import com.BankRest.mapper.AccountMapper;
import com.BankRest.repository.AccountRepository;
import com.BankRest.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	private AccountRepository accountRepository;
	

	public AccountServiceImpl(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}
	@Override
	public AccountDto createAccount(AccountDto accountDto) {
		Account account = AccountMapper.mapToAccount(accountDto);
		Account savedAccount = accountRepository.save(account);
		return AccountMapper.maptoAccountDto(savedAccount);
		
	}

}
