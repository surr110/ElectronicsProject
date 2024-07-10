package com.Electronics.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;


@Table(name="eacs")
@Entity
public class AirConditioner {
 @Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
 
 private int id;
 @Transient
 private String brand;
 private int price;
 private boolean isenergysaver;
 private String color;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public boolean isIsenergysaver() {
	return isenergysaver;
}
public void setIsenergysaver(boolean isenergysaver) {
	this.isenergysaver = isenergysaver;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
 

}
