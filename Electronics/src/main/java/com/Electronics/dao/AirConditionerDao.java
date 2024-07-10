package com.Electronics.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Electronics.entity.AirConditioner;
import com.Electronics.repo.AirConditionerRepo;

@Repository
public class AirConditionerDao {
	@Autowired
	AirConditionerRepo ar;

	public String setAc(AirConditioner a) {
		ar.save(a);
		return "Saved successfully";
	}

	public List<AirConditioner> getAc() {

		return ar.findAll();
	}

	public AirConditioner getAcByid(int a) {

		return ar.findById(a).get();
	}

	public String deleteidac(int a) {
		ar.deleteById(a);
		return "Removed Successfully";
	}


	public String updata(AirConditioner a) {
		ar.save(a);

		return "Updated Successfully";
	}

}
