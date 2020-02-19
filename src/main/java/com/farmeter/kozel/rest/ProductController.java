package com.farmeter.kozel.rest;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import javax.swing.text.html.Option;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.farmeter.kozel.entity.Product;
import com.farmeter.kozel.repository.ProductRepository;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/product/{productId}")
    public Product product(@RequestParam(value = "productId", defaultValue = "World") Long productId) {
        Optional<Product> product = productRepository.findById(productId);

        //TODO FIX
        //TODO FIX
        Product p = Optional.ofNullable(product).orElse(returnNull());

        return null;
    }

    private Product returnNull() {
        return null;
    }
}
