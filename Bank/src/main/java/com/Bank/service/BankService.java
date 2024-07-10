package com.Bank.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bank.dao.BankDao;
import com.Bank.entity.Bank;
@Service
public class BankService {
@Autowired
BankDao bd;
	public String setAll(List<Bank> b) {
		return bd.setAll(b);
	}
	public List<Bank> getAll() {
		// TODO Auto-generated method stub
		return bd.getAll();
	}
	
	public List<String> getbranch(String a) {
		List<Bank> bank1=getAll();
		List<String> bank2=bank1.stream().filter(x->x.getIfsccode().equals(a)).map(y->y.getBranch()).collect(Collectors.toList());
		return bank2;
	
	}


}
