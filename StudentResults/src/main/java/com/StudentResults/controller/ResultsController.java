package com.StudentResults.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.StudentResults.entity.MarkSheet;
import com.StudentResults.entity.Results;
import com.StudentResults.entity.Student;
import com.StudentResults.service.ResultsService;

@RestController
public class ResultsController {

	@Autowired
	RestTemplate rt;
	@Autowired
	ResultsService rs;

	@PostMapping(value = "setAll")
	public String setall(@RequestBody List<Results> r) {
		List<Results> rms = new ArrayList<>();

		for (Results d : r) {
			String url1 = "http://localhost:8080/Std/RollNumber/";
			String url2 = "http://localhost:8081/marks/Rollnumbers/";

			int a = d.getRollNumber();

			ResponseEntity<Student> res1 = rt.exchange(url1 + a, HttpMethod.GET, null,
					new ParameterizedTypeReference<Student>() {
					});

			ResponseEntity<MarkSheet> res2 = rt.exchange(url2 + a, HttpMethod.GET, null,
					new ParameterizedTypeReference<MarkSheet>() {
					});

			Student std1 = res1.getBody();

			MarkSheet mks = res2.getBody();

			d.setName(std1.getName());

			int total = mks.getSem2Total() + mks.getSem1Total();

			if (std1.getAttendance() > 90 && total < 400) {
				d.setTotalMarks(total + 5);
			} else {
				d.setTotalMarks(total);
			}

			d.setPercentage((mks.getSem2Total() + mks.getSem1Total()) / 4);

			rms.add(d);
		}

		return rs.setall(rms);
	}

	@PostMapping(value = "/postdata/{b}")
	public String postdatas(@RequestBody Results a, @PathVariable int b) {

		String url1 = "http://localhost:8080/Std/RollNumber/ ";
		String url2 = "http://localhost:8081/marks/Rollnumbers/ ";

		ResponseEntity<Student> res1 = rt.exchange(url1 + b, HttpMethod.GET, null, Student.class);

		ResponseEntity<MarkSheet> res2 = rt.exchange(url2 + b, HttpMethod.GET, null, MarkSheet.class);

		Student stu = res1.getBody();
		MarkSheet mks = res2.getBody();

		a.setName(stu.getName());
		a.setRollNumber(a.getRollNumber());

		if (stu.getAttendance() > 90) {
			a.setTotalMarks(mks.getSem1Total() + mks.getSem2Total() + 5);
		} else {
			a.setTotalMarks(mks.getSem1Total() + mks.getSem2Total());
		}
		a.setPercentage(a.getTotalMarks() / 4);

		return rs.postdatas(a);

	}
}
