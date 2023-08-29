package com.tcs.momolithicApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.momolithicApp.entity.Order;
import com.tcs.momolithicApp.entity.Product;
import com.tcs.momolithicApp.service.OrderService;
import com.tcs.momolithicApp.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping
	 public List<Product> getAllProducts() {
	        return productService.getAllProducts();
	    }

	
	    @GetMapping("/{id}")
	    public Product getProduct(@PathVariable Long id) {
	        return productService.getProduct(id);
	          
	    }

	    @PostMapping
	    public Product save(@RequestBody Product product) {
	        return productService.save(product);
	    }
	    
	    @PutMapping("/{id}")
	    public void update(@PathVariable Long id,@RequestBody Product product) {
	        productService.updateProduct(product);
	    }
	

}
