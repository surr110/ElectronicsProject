package com.Gst.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Gst.entity.Gst;

public interface GstRepo extends JpaRepository<Gst, Integer> {
	@Query(value="select percentage from gstdetails.gstbill where hsncode like ?", nativeQuery= true)
	public int gethsncode(int a);

}
