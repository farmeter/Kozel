package com.farmeter.kozel.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @GetMapping("/products")
    public List<Product> products() {
        return productRepository.findAll();
    }

    @PostMapping("/product")
    public void productSave(Product product) {
        productRepository.save(product);
    }

    @DeleteMapping("/product")
    public void productDelete(Product product) {
        productRepository.delete(product);
    }

}
