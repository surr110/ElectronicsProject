package com.Electronics.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Electronics.entity.AirConditioner;

public interface AirConditionerRepo extends JpaRepository<AirConditioner, Integer>{

}
