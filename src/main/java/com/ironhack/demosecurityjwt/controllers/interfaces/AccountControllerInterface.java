package com.ironhack.demosecurityjwt.controllers.interfaces;

import com.ironhack.demosecurityjwt.models.Account;

import java.util.List;

public interface AccountControllerInterface {
    List<Account> getAccounts();
    void saveAccount(Account account);
}
