package com.StudentResults.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.StudentResults.entity.Results;
import com.StudentResults.repo.ResultsRepo;
@Repository
public class ResultsDao {
	
	@Autowired
	ResultsRepo rr;

	public String setall(List<Results> rms) {
		rr.saveAll(rms);
		
		return "<---------Data Stored------------>";
	}

	public String postdatas(Results a) {
		rr.save(a);
		return "Data Successfully Saved" ;
	}

}
