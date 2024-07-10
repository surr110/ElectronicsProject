package com.Bank.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Bank.entity.Bank;
import com.Bank.repo.BankRepo;
@Repository
public class BankDao {
	@Autowired
	BankRepo br;

	public String setAll(List<Bank> b) {
		br.saveAll(b);
		return "Bank Details Saved";
		
	}

	public List<Bank> getAll() {
		
		return br.findAll();
	}

}
