package com.Bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bank.entity.Bank;
import com.Bank.service.BankService;

@RequestMapping(value="/bank")
@RestController
public class BankController {
@Autowired
BankService bs;

@PostMapping(value="/postAll")
public String setAll(@RequestBody List<Bank> b) {
	return bs.setAll(b);
}

@GetMapping(value="/getAll")
public List<Bank> getAll(){
	return bs.getAll();
}
@GetMapping(value ="getbranchdetail/{a}")
public List<String> getbranch(@PathVariable String a) {
	return bs.getbranch(a);
}
}
