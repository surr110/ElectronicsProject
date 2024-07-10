package com.Flipkart.orderentity;

import java.util.List;

import com.Flipkart.productentity.ProductEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "Order_table")
@Entity
public class OrderEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String city;
	private int pincode;
	
	@OneToMany(targetEntity = ProductEntity.class,cascade = CascadeType.ALL)
	//@ManyToOne(targetEntity=ProductEntity.class,cascade = CascadeType.ALL)
	
	@JoinColumn(name="Order_fkey",referencedColumnName = "id")
    private List<ProductEntity> product;
    
	
	
	public List<ProductEntity> getProduct() {
		return product;
	}

	public void setPr(List<ProductEntity> product) {
		this.product = product;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}
