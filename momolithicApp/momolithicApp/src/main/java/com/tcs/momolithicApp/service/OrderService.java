package com.tcs.momolithicApp.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.momolithicApp.entity.Order;
import com.tcs.momolithicApp.repo.OrderRepository;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class OrderService {
	
	@Autowired
	OrderRepository orderRepository;
	
	   
	    public List<Order> getAllOrders() {
	        return this.orderRepository.findAll();
	    }
		
	  
	    public Order create(Order order) {
	        order.setDateCreated(LocalDate.now());
	        return this.orderRepository.save(order);
	    }

	   
	    public void update(Order order) {
	        this.orderRepository.save(order);
	    }

}
