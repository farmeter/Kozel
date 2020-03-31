package com.farmeter.kozel.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.farmeter.kozel.entity.Category;
import com.farmeter.kozel.entity.Product;
import com.farmeter.kozel.repository.CateogoryRepository;
import com.farmeter.kozel.repository.ProductRepository;

@Component
public class SampleData {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    CateogoryRepository cateogoryRepository;

    public void doSample() {
        addSampleData();
        viewSampleData();
    }

    private void addSampleData() {
        System.out.println("============== addSampleData");

        cateogoryRepository.save(Category.builder().categoryName("beauty").build());
        cateogoryRepository.save(Category.builder().categoryName("food").build());
        cateogoryRepository.save(Category.builder().categoryName("sports").build());

        productRepository.save(Product.builder().name("productName1").originPrice(100L).salePrice(50L).build());
        productRepository.save(Product.builder().name("productName2").originPrice(100L).salePrice(50L).build());
        productRepository.save(Product.builder().name("productName3").originPrice(100L).salePrice(50L).build());

    }

    public void viewSampleData() {
        System.out.println("============== viewSampleData");
        cateogoryRepository.findAll().forEach(c -> System.out.println(c));
        productRepository.findAll().forEach(p -> System.out.println(p));
    }

}
