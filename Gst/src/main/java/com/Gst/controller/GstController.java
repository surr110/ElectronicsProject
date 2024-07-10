package com.Gst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Gst.entity.Gst;
import com.Gst.service.GstService;

@RestController
public class GstController {
	
	@Autowired
	GstService gs;
	
	@PostMapping(value="/PostAll")
	public String postAll(@RequestBody List<Gst> g) {
		return gs.postAll(g);
	}
	@GetMapping(value="/getHsn/{a}")
	public int gethsncode(@PathVariable int a) {
		return gs.gethsncode(a);
	}

}
