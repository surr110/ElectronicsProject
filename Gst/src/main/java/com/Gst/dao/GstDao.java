package com.Gst.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Gst.entity.Gst;
import com.Gst.repo.GstRepo;
@Repository
public class GstDao {
	@Autowired
	GstRepo gr;

	public String postAll(List<Gst> g) {
		gr.saveAll(g);
		
		return "<----------Sucessfully Saved----------->";
	}

	public int gethsncode(int a) {
		
		return gr.gethsncode(a);
	}

}
