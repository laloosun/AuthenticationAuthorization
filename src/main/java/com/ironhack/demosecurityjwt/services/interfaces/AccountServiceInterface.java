package com.ironhack.demosecurityjwt.services.interfaces;

import com.ironhack.demosecurityjwt.models.Account;

import java.util.List;

public interface AccountServiceInterface {
    Account saveAccount(Account account);
    List<Account> getAccounts();
}
