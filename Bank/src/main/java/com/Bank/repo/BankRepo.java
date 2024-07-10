package com.Bank.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Bank.entity.Bank;

public interface BankRepo extends JpaRepository<Bank, Integer> {

}
