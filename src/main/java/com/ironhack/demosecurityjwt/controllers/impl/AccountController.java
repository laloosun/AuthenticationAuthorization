package com.ironhack.demosecurityjwt.controllers.impl;

import com.ironhack.demosecurityjwt.controllers.interfaces.AccountControllerInterface;
import com.ironhack.demosecurityjwt.models.Account;
import com.ironhack.demosecurityjwt.services.interfaces.AccountServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AccountController implements AccountControllerInterface {

    @Autowired
    private AccountServiceInterface accountService;

    @GetMapping("/accounts")
    @ResponseStatus(HttpStatus.OK)
    public List<Account> getAccounts() {
        return accountService.getAccounts();
    }

    @PostMapping("/accounts")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveAccount(@RequestBody Account account) {
        accountService.saveAccount(account);
    }
}
