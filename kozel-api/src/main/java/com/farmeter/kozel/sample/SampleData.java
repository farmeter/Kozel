package com.farmeter.kozel.sample;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.farmeter.kozel.entity.Category;
import com.farmeter.kozel.entity.CategoryProduct;
import com.farmeter.kozel.entity.Product;
import com.farmeter.kozel.repository.CategoryProductRepository;
import com.farmeter.kozel.repository.CategoryRepository;
import com.farmeter.kozel.repository.ProductRepository;

@Component
public class SampleData {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository cateogoryRepository;

    @Autowired
    private CategoryProductRepository categoryProductRepository;

    public void doSample() {
        addSampleData();
        viewSampleData();
    }

    private void addSampleData() {
        System.out.println("============== addSampleData");

        Category c1 = Category.builder().categoryName("beauty").build();
        Category c2 = Category.builder().categoryName("food").build();
        Category c3 = Category.builder().categoryName("sports").build();
        cateogoryRepository.saveAll(Arrays.asList(c1, c2, c3));

        Product p1 = Product.builder().name("productName1").originPrice(100L).salePrice(50L).build();
        Product p2 = Product.builder().name("productName2").originPrice(100L).salePrice(50L).build();
        Product p3 = Product.builder().name("productName3").originPrice(100L).salePrice(50L).build();
        productRepository.saveAll(Arrays.asList(p1,p2,p3));

        categoryProductRepository.save(CategoryProduct.builder().Category(c1).product(p1).build());

    }

    public void viewSampleData() {
        System.out.println("============== viewSampleData");
//        cateogoryRepository.findAll().forEach(c -> System.out.println(c));
//        productRepository.findAll().forEach(p -> System.out.println(p));
    }

}
