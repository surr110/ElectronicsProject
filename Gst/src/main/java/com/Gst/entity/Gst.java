package com.Gst.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="gstbill")
@Entity
public class Gst {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	
	private int id;
	private int HSNcode;
	private int percentage;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHSNcode() {
		return HSNcode;
	}
	public void setHSNcode(int hSNcode) {
		HSNcode = hSNcode;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	

}
