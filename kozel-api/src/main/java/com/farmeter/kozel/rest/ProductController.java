package com.farmeter.kozel.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.farmeter.kozel.entity.Product;
import com.farmeter.kozel.repository.ProductRepository;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/product/{id}")
    public Product product(@PathVariable(value = "id") Long productId) {
        return productRepository.findById(productId).orElse(null);
    }
}
