package com.tcs.momolithicApp.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.tcs.momolithicApp.entity.Order;
import com.tcs.momolithicApp.service.OrderService;

@RestController
@RequestMapping("/api/order")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	
    
    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }
	
    @PostMapping
    public Order create(@RequestBody Order order) {
        return orderService.create(order);
    }

   @PutMapping("/{id}")
    public void update(@PathVariable Long id,@RequestBody Order order) {
        this.orderService.update(order);
    }
   

   }
