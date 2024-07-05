package com.ironhack.demosecurityjwt.repositories;

import com.ironhack.demosecurityjwt.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}
