package com.capgemini.order.Controller;

import java.awt.event.ItemListener;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.order.entity.LineItem;
import com.capgemini.order.entity.Order;
import com.capgemini.order.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	/*@Autowired
	HashMap<Integer, List<LineItem>> orderList;
*/
	/*public OrderController(HashMap<Integer, List<LineItem>> orderList) {
		super();
		orderList = new HashMap<>();
	}*/

	@PostMapping("/addToCart")
	public ResponseEntity<Order> addToCart( @RequestBody Order order) {
		//List<LineItem> itemsAddedToCart = orderList.get(customerId);
		/*if (itemsAddedToCart == null)
			itemsAddedToCart.add(customerId, lineItem);
		else {
			if (itemsAddedToCart.contains(lineItem))
				lineItem.setAddProductQuantity();
			if (!itemsAddedToCart.contains(lineItem))
				itemsAddedToCart.add(lineItem);
		}*/
		
		orderService.submitOrder(order);
		ResponseEntity<Order> responseEntity = new ResponseEntity<Order>(order,
				HttpStatus.OK);
		return responseEntity;

		// return responseEntity;
	}

	/*@PostMapping("/removefromcart/{customerId}")
	public ResponseEntity<List<LineItem>> removeFromCart(@PathVariable int customerId, @RequestBody int lineItemId) {
		List<LineItem> itemsAddedToCart = orderList.get(customerId);
		int count = 0;

		for (LineItem item : itemsAddedToCart) {
			if (item.getLineItemId() == lineItemId) {
				itemsAddedToCart.remove(item);
				count = 1;
			}
		}
		if (count == 1)
			;
		// throw product not found exception

		ResponseEntity<List<LineItem>> responseEntity = new ResponseEntity<List<LineItem>>(itemsAddedToCart,
				HttpStatus.OK);
		return responseEntity;

	}
	
	@GetMapping("/getfromcart/{customerId}")
	public ResponseEntity<List<LineItem>> getFromCart(@PathVariable int customerId) {
		List<LineItem> itemsAddedToCart = orderList.get(customerId);
		return new ResponseEntity<List<LineItem>>(itemsAddedToCart,HttpStatus.OK);

		
	}
	
	@GetMapping("/orders/submitorder/{customerId}")
	public ResponseEntity<List<LineItem>> submitOrder(@PathVariable int customerId) {
		List<LineItem> orderPlacedItems = orderList.get(customerId);
		return new ResponseEntity<List<LineItem>>(orderPlacedItems,HttpStatus.OK);

		
	}
	

	*/
	
	
	

}
