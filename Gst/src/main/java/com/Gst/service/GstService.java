package com.Gst.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Gst.dao.GstDao;
import com.Gst.entity.Gst;
@Service
public class GstService {
	@Autowired
	GstDao gd;

	public String postAll(List<Gst> g) {
		// TODO Auto-generated method stub
		return gd.postAll(g);
	}

	public int gethsncode(int a) {
		
		return gd.gethsncode(a);
	}

}
