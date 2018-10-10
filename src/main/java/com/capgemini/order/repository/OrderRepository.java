package com.capgemini.order.repository;
import org.springframework.boot.autoconfigure.mongo.MongoClientSettingsBuilderCustomizer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.order.entity.Order;
public interface OrderRepository extends MongoRepository<Order, Integer> {

}
