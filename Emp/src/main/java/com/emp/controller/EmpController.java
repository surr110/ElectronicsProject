package com.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emp.entity.Emp;
import com.emp.service.EmpService;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class EmpController {

	@Autowired
	EmpService es;

	@PostMapping(value = "/set")
	public String setEmp(@RequestBody Emp e) {
		return es.setEmp(e);
	}

	@GetMapping(value = "/getAll")

	public List<Emp> getEmp() {
		return es.getEmp();
	}

	// getbyid//

	@GetMapping(value = "/getEmps/{a}")
	public Emp getByEmpId(@PathVariable int a) {
		return es.getByEmpId(a);
	}

	// deleting

	@DeleteMapping(value = "/deletes/{a}")
	public String delByEmpId(@PathVariable int a) {
		return es.delByEmpId(a);

	}

	// updating//

	@PutMapping(value = "/updata/{a}")
	public String upempid(@PathVariable int a, @RequestBody Emp e) {

		return es.upempid(a, e);
	}
	
	
	
	@PutMapping(value = "/updata_id/{b}")
	public String updateEmp(@PathVariable int b , @RequestBody Emp e) {
		return es.updateEmp(b, e);

	}
}
