package com.capgemini.order.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.order.entity.Order;
import com.capgemini.order.repository.OrderRepository;
import com.capgemini.order.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService {
	public static int orderId=1;

	
	@Autowired
	OrderRepository orderRepository;
	
	
	@Override
	public List<Order> getOrders() {
		return orderRepository.findAll();
		
	}
	@Override
	public Order getOrderById(int orderId) {
		return null;

	}
	@Override
	public void submitOrder(Order order) {

		order.setOrderId(orderId++);
		order.setStatus("PLACED");
		orderRepository.save(order);
	}
	@Override
	public void updateOrder(Order order) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteOrder(int orderId) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void cancelorder(int orderId) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Order addOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
