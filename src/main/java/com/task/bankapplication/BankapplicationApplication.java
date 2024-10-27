package com.task.bankapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.task.bankapplication.dto.AccountDto;
import com.task.bankapplication.serviceImpl.BankTransactionService;
import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
//@EnableEncryptableProperties
public class BankapplicationApplication {
	@Autowired
    private BankTransactionService bankTransactionService;
	public static void main(String[] args) {
		SpringApplication.run(BankapplicationApplication.class, args);
	}
	public void run(String... args) throws Exception {
        // Create a normal account
        AccountDto normalAccount = new AccountDto(1L, "Normal", 0);
        bankTransactionService.createNormalAccount(normalAccount);

        // Create a premium account
        AccountDto premiumAccount = new AccountDto(2L, "Premium", 0);
        bankTransactionService.createPremiumAccount(premiumAccount);

        // Deposit to both accounts
        bankTransactionService.depositToNormalAccount(1L, 500);
        bankTransactionService.depositToPremiumAccount(2L, 1500);
    }
}
