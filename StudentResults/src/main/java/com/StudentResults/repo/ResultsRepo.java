package com.StudentResults.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.StudentResults.entity.Results;

public interface ResultsRepo extends JpaRepository<Results, Integer> {
	

	@Query(value= "select * from results order by total_marks desc limit 3",nativeQuery=true)
	List<Results>getTop3();
	
	@Query(value="select * from results order by total_marks desc limit 1",nativeQuery=true)
	List<Results>getTopper();
	
	@Query(value="select * from results where percentage>85 and percentage<100", nativeQuery=true)
    List<Results> getparticulardetail();

}
