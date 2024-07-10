package com.transaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.transaction.entity.Receiverrepo;
import com.transaction.entity.Senderrepo;
import com.transaction.entity.Transaction;

import jakarta.transaction.Transactional;

@RestController
public class TransactionController {

	@Autowired
	Senderrepo sr;
	@Autowired
	Receiverrepo rr;

	@PostMapping("PostThis")
	@Transactional
	public String setThis(@RequestBody Transaction t) {
		sr.save(t.getSender());
		rr.save(t.getReceiver());
		//int a=10/0;
		return "Saved Successfully";
	}

}
