package com.tcs.momolithicApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.momolithicApp.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
