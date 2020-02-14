package com.farmeter.kozel.rest;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.farmeter.kozel.entity.Product;

@RestController
public class ProductController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/product")
    public Product product(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Product(counter.incrementAndGet(), "Hello, "+ name);
    }
}
