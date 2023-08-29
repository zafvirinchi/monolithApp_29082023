package com.tcs.momolithicApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.momolithicApp.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
