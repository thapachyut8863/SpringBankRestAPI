package com.BankRest.mapper;

import com.BankRest.dto.AccountDto;
import com.BankRest.entity.Account;

public class AccountMapper {
	public static Account mapToAccount(AccountDto accountDto) {
		Account account = new Account(
				accountDto.getId(),
				accountDto.getAccountHolderName(),
				accountDto.getBalance()
				);
		return account;
		
		
	}
	public static AccountDto maptoAccountDto(Account account ) {
		AccountDto accountDto = new AccountDto(
				account.getId(),
				account.getAccountHolderName(),
				account.getBalance()
				);
		return accountDto;
		
	}
	

}
