package com.capgemini.order.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.capgemini.order.entity.Order;
import com.capgemini.order.service.OrderService;

@Controller
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/Orders")
	public ResponseEntity<Order> addOrder(@RequestBody Order Order) {
		ResponseEntity<Order> responseEntity = new ResponseEntity<Order>(orderService.addOrder(Order),
				HttpStatus.OK);

		return responseEntity;
	}

}
