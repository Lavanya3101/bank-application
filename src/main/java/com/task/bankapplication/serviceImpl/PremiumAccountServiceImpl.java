package com.task.bankapplication.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.task.bankapplication.dto.AccountDto;
import com.task.bankapplication.service.AccountService;

@Service("premiumAccountService")
public class PremiumAccountServiceImpl implements AccountService {

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        // Premium account creation logic
        accountDto.setBalance(1000.0);  // Example logic
        System.out.println("Created Premium Account with default balance: 1000.0");
        return accountDto;
    }

    @Override
    public AccountDto deposit(Long id, double amount) {
        // Logic for deposit in premium account
        System.out.println("Depositing " + amount + " to Premium Account ID: " + id);
        return new AccountDto(id, "Premium Account", amount);
    }

    @Override
    public AccountDto withdraw(Long id, double amount) {
        // Logic for withdraw from premium account
        System.out.println("Withdrawing " + amount + " from Premium Account ID: " + id);
        return new AccountDto(id, "Premium Account", -amount);
    }

    @Override
    public AccountDto getAccountById(Long id) {
        // Logic to get account by ID
        return new AccountDto(id, "Premium Account", 2000.0);
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
