package com.farmeter.kozel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

import com.farmeter.kozel.entity.Product;
import com.farmeter.kozel.repository.ProductRepository;
import com.farmeter.kozel.util.CommonUtils;

@Slf4j
@Component
public class SampleData {

    @Autowired
    ProductRepository productRepository;

    public void doSample() {
        addSampleData();
        viewSampleData();
    }

    public void addSampleData() {
        log.info("============== addSampleData");

        productRepository.save(Product.builder().name("productName1").originPrice(100L).salePrice(50L).build());
        productRepository.save(Product.builder().name("productName2").originPrice(100L).salePrice(50L).build());
        productRepository.save(Product.builder().name("productName3").originPrice(100L).salePrice(50L).build());
    }

    public void viewSampleData() {
        log.info("============== viewSampleData");
        productRepository.findAll().forEach(p -> log.info("{}", CommonUtils.toJson(p)));
    }

}
