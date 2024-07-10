package com.Amazon.productentity;

import java.util.ArrayList;
import java.util.List;

import com.Amazon.orderentity.OrderEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "products_table")
@Entity
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private int price;

	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	private List<OrderEntity> orders = new ArrayList<>();

	public ProductEntity() {
	}

	public ProductEntity(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<OrderEntity> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderEntity> orders) {
		this.orders = orders;
	}

	public void addOrder(OrderEntity order) {
		orders.add(order);
		order.setProduct(this);
	}

	public void removeOrder(OrderEntity order) {
		orders.remove(order);
		order.setProduct(null);
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
