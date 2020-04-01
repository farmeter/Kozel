package com.farmeter.kozel.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.farmeter.kozel.entity.Product;
import com.farmeter.kozel.repository.ProductRepository;

@RestController
public class DefaultController {

    @GetMapping("/")
    public String root() {
        return "Hello, Kozel API!";
    }
}
