package com.capgemini.order.service;

import java.util.List;

import com.capgemini.order.entity.Order;

public interface OrderService {
	public Order addOrder(Order order);
	
	public List<Order> getOrders();
	public Order getOrderById(int orderId);
	public void submitOrder(Order order);
	public void updateOrder(Order order);
	public void deleteOrder(int orderId);
	public void cancelorder(int orderId);

}
