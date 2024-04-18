package com.BankRest.service.impl;

import java.util.List;
import java.util.stream.Collectors;

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

	@Override
	public AccountDto getAccountById(Long Id) {
		// TODO Auto-generated method stub
		Account account = accountRepository.findById(Id)
				.orElseThrow(() -> new RuntimeException("Account Doesn't Exists"));
		return AccountMapper.maptoAccountDto(account);
	}

	@Override
	public AccountDto deposit(Long id, double amount) {
		// TODO Auto-generated method stub

		Account account = accountRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Account Doesn't Exists"));
		double total = account.getBalance() + amount;
		account.setBalance(total);
		Account savedAccount = accountRepository.save(account);
		return AccountMapper.maptoAccountDto(savedAccount);
	}

	public AccountDto withdrawl(Long id, double amount) {
		Account account = accountRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Account Doesn't Exists"));
		if (account.getBalance() < amount) {
			throw new RuntimeException("Insufficient Balance!");
		}

		double total = account.getBalance() - amount;
		account.setBalance(total);
		Account savedAccount = accountRepository.save(account);
		return AccountMapper.maptoAccountDto(savedAccount);
	}

	@Override
	public List<AccountDto> getAllAccounts() {
		// TODO Auto-generated method stub
		List<Account> accounts = accountRepository.findAll();
		return accounts.stream().map((account) -> AccountMapper.maptoAccountDto(account)).collect(Collectors.toList());

	}

	@Override
	public void deleteAccount(Long id) {
		Account account = accountRepository.findById(id)
				.orElseThrow(()-> new RuntimeException("Account Doesn't Exists"));
		accountRepository.deleteById(id);
		
	}
}
