package com.farmeter.kozel.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.farmeter.kozel.entity.Category;
import com.farmeter.kozel.repository.CategoryRepository;

@RestController
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("/categories")
    public List<Category> categoryList() {
        return categoryRepository.findAll();
    }

    @GetMapping("/category/{id}")
    public Category category(@PathVariable(value = "id") Long productId) {
        return categoryRepository.findById(productId).orElse(null);
    }
}
