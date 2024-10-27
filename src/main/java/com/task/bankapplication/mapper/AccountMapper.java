package com.task.bankapplication.mapper;

import com.task.bankapplication.dto.AccountDto;
import com.task.bankapplication.entity.Account;

public class AccountMapper {
	public static Account mapToAccount(AccountDto accountDto) {
		Account account=new Account(
				accountDto.getId(),
				accountDto.getAccountHolderName(),
				accountDto.getBalance()
				);
		return account;
	}
	public static AccountDto mapToAccountDto(Account account) {
		AccountDto accountDto=new AccountDto(account.getId(), account.getAccountHolderName(), account.getBalance());
	return accountDto;
	}

}
