package com.ironhack.demosecurityjwt.models;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class CheckingAccount extends Account {
    private Double overdraftLimit;

    public CheckingAccount(Long id, String accountNumber, Double balance, Double overdraftLimit) {
        super(id, accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }
}
