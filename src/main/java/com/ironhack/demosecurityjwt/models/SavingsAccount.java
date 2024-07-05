package com.ironhack.demosecurityjwt.models;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class SavingsAccount extends Account {
    private Double interestRate;

    public SavingsAccount(Long id, String accountNumber, Double balance, Double interestRate) {
        super(id, accountNumber, balance);
        this.interestRate = interestRate;
    }
}
