package com.task.bankapplication.serviceImpl;


import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.task.bankapplication.dto.AccountDto;
import com.task.bankapplication.service.AccountService;

@Primary
@Service
public class NormalAccountServiceImpl implements AccountService {

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        // Normal account creation logic
        accountDto.setBalance(100.0);  // Example logic
        System.out.println("Created Normal Account with default balance: 100.0");
        return accountDto;
    }

    @Override
    public AccountDto deposit(Long id, double amount) {
        // Logic for deposit in normal account
        System.out.println("Depositing " + amount + " to Normal Account ID: " + id);
        return new AccountDto(id, "Normal Account", amount);
    }

    @Override
    public AccountDto withdraw(Long id, double amount) {
        // Logic for withdraw from normal account
        System.out.println("Withdrawing " + amount + " from Normal Account ID: " + id);
        return new AccountDto(id, "Normal Account", -amount);
    }

    @Override
    public AccountDto getAccountById(Long id) {
        // Logic to get account by ID
        return new AccountDto(id, "Normal Account", 500.0);
    }

	@Override
	public List<AccountDto> getAllAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAccount(Long id) {
		// TODO Auto-generated method stub
		
	}
}
