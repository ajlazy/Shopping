package com.capgemini.order.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.order.entity.Order;
import com.capgemini.order.repository.OrderRepository;
import com.capgemini.order.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService {

	
	@Autowired
	OrderRepository orderRepository;
	@Override
	public Order addOrder(Order order) {
		return orderRepository.save(order);

	}
	
	

}
