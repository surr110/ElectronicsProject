package com.StudentResults.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentResults.dao.ResultsDao;
import com.StudentResults.entity.Results;


@Service
public class ResultsService {
	
	@Autowired
	ResultsDao rd;

	public String setall(List<Results> rms) {

		return rd.setall(rms);
	}

	public String postdatas(Results a) {

		return rd.postdatas(a);

	}

}
