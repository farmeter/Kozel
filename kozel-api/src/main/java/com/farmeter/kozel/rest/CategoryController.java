package com.farmeter.kozel.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.farmeter.kozel.entity.Category;
import com.farmeter.kozel.entity.CategoryProduct;
import com.farmeter.kozel.repository.CategoryProductRepository;
import com.farmeter.kozel.repository.CategoryRepository;

@RestController
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryProductRepository categoryProductRepository;

    @GetMapping("/categories")
    public List<Category> categoryList() {
        return categoryRepository.findAll();
    }

    @GetMapping("/category/{id}")
    public Category category(@PathVariable(value = "id") Long productId) {
        return categoryRepository.findById(productId).orElse(null);
    }

    @GetMapping("/categories-products")
    public List<CategoryProduct> categoryProductList() {
        return categoryProductRepository.findAll();
    }

}
