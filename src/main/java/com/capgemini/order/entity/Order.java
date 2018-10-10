package com.capgemini.order.entity;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Document(collection="Order")
public class Order {
	
	
	@Id
	int orderId;
	float totalAmount;
	String status;
	LocalDate dateOfOrder;
	int customerId;
	Set<LineItem> lineItem;
	public Order(int orderId, float totalAmount, String status, LocalDate dateOfOrder, int customerId,
			Set<LineItem> lineItem) {
		super();
		this.orderId = orderId;
		this.totalAmount = totalAmount;
		this.status = status;
		this.dateOfOrder = dateOfOrder;
		this.customerId = customerId;
		this.lineItem = lineItem;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public float getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDate getDateOfOrder() {
		return dateOfOrder;
	}
	public void setDateOfOrder(LocalDate dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public Set<LineItem> getLineItem() {
		return lineItem;
	}
	public void setLineItem(Set<LineItem> lineItem) {
		this.lineItem = lineItem;
	}


	
	

}
