package com.capgemini.order.entity;

import javax.persistence.Table;


@Table(name="LineItem")
public class LineItem {
	int lineItemId;
	int productId;
	int productQuantity;
	//int totalAmount;
	public LineItem(int lineItemId, int productId, int productQuantity) {
		super();
		this.lineItemId = lineItemId;
		this.productId = productId;
		this.productQuantity = productQuantity;
	}
	public LineItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getLineItemId() {
		return lineItemId;
	}
	public void setLineItemId(int orderId) {
		this.lineItemId = orderId;
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
	public void setAddProductQuantity() {
		this.productQuantity+=1 ;	
		}
	
	public void setreduceProductQuantity() {
		this.productQuantity-=1 ;	
		}
	

	

}


