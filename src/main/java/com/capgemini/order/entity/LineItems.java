package com.capgemini.order.entity;

import javax.persistence.Entity;
import javax.persistence.Table;


@Table(name="LineItems")
public class LineItems {
	int orderId;
	int productId;
	int productQuantity;
	int totalAmount;
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public LineItems(int orderId, int productId, int productQuantity, int totalAmount) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.productQuantity = productQuantity;
		this.totalAmount = totalAmount;
	}
	public LineItems() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}


