package com.task.bankapplication.serviceImpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.task.bankapplication.dto.AccountDto;
import com.task.bankapplication.service.AccountService;

@Service
public class BankTransactionService {

    private final AccountService normalAccountService;
    private final AccountService premiumAccountService;

    @Autowired
    public BankTransactionService(
            AccountService normalAccountService,  // @Primary will be used here
            @Qualifier("premiumAccountService") AccountService premiumAccountService) {
        this.normalAccountService = normalAccountService;
        this.premiumAccountService = premiumAccountService;
    }

    public void createNormalAccount(AccountDto accountDto) {
        normalAccountService.createAccount(accountDto);
    }

    public void createPremiumAccount(AccountDto accountDto) {
        premiumAccountService.createAccount(accountDto);
    }

    public void depositToNormalAccount(Long id, double amount) {
        normalAccountService.deposit(id, amount);
    }

    public void depositToPremiumAccount(Long id, double amount) {
        premiumAccountService.deposit(id, amount);
    }

    // Similarly, other transaction methods can be added
}
