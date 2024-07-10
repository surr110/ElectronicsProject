package com.StudentMarkSheet.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.StudentMarkSheet.entity.MarkSheet;
import com.StudentMarkSheet.repo.MarkSheetRepo;

@Repository
public class MarkSheetDao {
	@Autowired
	MarkSheetRepo ms;
	
	public String setData(MarkSheet m) {
		
		ms.save(m);
		
		return "<-------Marks Saved Successfully----------->";
	}

	public List<MarkSheet> getmarkdata() {
		
		return ms.findAll();
	}

	public MarkSheet getByRN(int a) {
		
		return ms.getByRN(a);
	}

}
