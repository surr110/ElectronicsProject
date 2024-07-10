package com.StudentMarkSheet.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentMarkSheet.dao.MarkSheetDao;
import com.StudentMarkSheet.entity.MarkSheet;

@Service
public class MarkSheetService {
	@Autowired
	MarkSheetDao md;

	public String setData(MarkSheet m) {

		int sem1Total = (m.getSem1Theory() + m.getSem1Practicals());
		int sem2Total = (m.getSem2Theory() + m.getSem2Practicals());
		m.setSem1Total(sem1Total);
		m.setSem2Total(sem2Total);

		return md.setData(m);
	}

	public List<MarkSheet> getmarkdata() {

		return md.getmarkdata();
	}

	public MarkSheet getRollnumberdata(int a) {
		
		return md.getByRN(a);

	}

	public List<Integer> getTotal() {
		List<MarkSheet> std = getmarkdata();
		List<Integer> totalvalue = std.stream().map(x -> x.getSem1Total() + x.getSem2Total())
				.collect(Collectors.toList());
		return totalvalue;
	}
}
