package com.StudentMarkSheet.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.StudentMarkSheet.entity.MarkSheet;

public interface MarkSheetRepo extends JpaRepository<MarkSheet, Integer> {

	@Query(value = "select * from studentsmarkdetail.mark_sheet where roll_number Like ?", nativeQuery = true)
	MarkSheet getByRN(int a);

}
