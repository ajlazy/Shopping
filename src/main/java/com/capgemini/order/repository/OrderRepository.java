package com.capgemini.order.repository;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.order.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Integer> {

}
