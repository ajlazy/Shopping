package com.capgemini.order.entity;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Order")
public class Order {
	
	
	@Id
	int orderId;
	float totalAmount;
	LocalDate dateOfOrder;
	int customerId;
	@OneToMany(mappedBy="lineitems")
	@JoinColumn(referencedColumnName="orderId")
	Set<LineItems> lineItems;
	public Order(int orderId, float totalAmount, LocalDate dateOfOrder, int customerId) {
		super();
		this.orderId = orderId;
		this.totalAmount = totalAmount;
		this.dateOfOrder = dateOfOrder;
		this.customerId = customerId;
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
	
	
	
	

}
