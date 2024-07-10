package com.StudentMarkSheet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StudentMarkSheet.entity.MarkSheet;
import com.StudentMarkSheet.service.MarkSheetService;

@RequestMapping("marks")
@RestController
public class MarkSheetController {
	
	@Autowired
	MarkSheetService ms;
	
	@PostMapping(value="/Postdata")
	public String setData(@RequestBody MarkSheet m) {
		 return ms.setData(m);
	}
	
	@GetMapping(value="/getAllData")
	public List<MarkSheet> getmarkdata(){
		return ms.getmarkdata();
	}
	
	@GetMapping(value="/Rollnumbers/{a}")
	public MarkSheet getRollnumberdata(@PathVariable int a){
		return ms.getRollnumberdata(a);
	}
	
    @GetMapping(value="/TotalMarks")
    public List<Integer>getTotal(){
    	return ms.getTotal();
    }

}
