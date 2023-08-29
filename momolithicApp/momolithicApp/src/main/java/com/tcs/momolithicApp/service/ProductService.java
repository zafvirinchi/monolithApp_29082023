package com.tcs.momolithicApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.momolithicApp.entity.Product;
import com.tcs.momolithicApp.repo.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

  
    public Product getProduct(long id) {
        return productRepository
          .findById(id).orElse(null);
         // .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
    }

   
    public Product save(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }
}
