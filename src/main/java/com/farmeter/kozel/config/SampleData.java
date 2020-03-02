package com.farmeter.kozel.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

import com.farmeter.kozel.entity.Category;
import com.farmeter.kozel.entity.Product;
import com.farmeter.kozel.repository.CateogoryRepository;
import com.farmeter.kozel.repository.ProductRepository;
import com.farmeter.kozel.util.CommonUtils;

@Slf4j
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

    public void addSampleData() {
        log.info("============== addSampleData");

        cateogoryRepository.save(Category.builder().categoryName("beauty").build());
        cateogoryRepository.save(Category.builder().categoryName("food").build());
        cateogoryRepository.save(Category.builder().categoryName("sports").build());

//        productRepository.save(Product.builder().name("productName1").originPrice(100L).salePrice(50L).categoryNos(Arrays.asList(1L,2L)).build());
//        productRepository.save(Product.builder().name("productName2").originPrice(100L).salePrice(50L).categoryNos(Arrays.asList(2L,3L)).build());
//        productRepository.save(Product.builder().name("productName3").originPrice(100L).salePrice(50L).categoryNos(Arrays.asList(1L,2L,3L)).build());

        productRepository.save(Product.builder().name("productName1").originPrice(100L).salePrice(50L).build());
        productRepository.save(Product.builder().name("productName2").originPrice(100L).salePrice(50L).build());
        productRepository.save(Product.builder().name("productName3").originPrice(100L).salePrice(50L).build());

    }

    public void viewSampleData() {
        log.info("============== viewSampleData");

//        log.info("============== viewSampleData" + cateogoryRepository.findAll().size());
//        log.info("============== viewSampleData" + cateogoryRepository.findAll().get(0).getCategoryNo());

        List<Category> categoryList =  cateogoryRepository.findAll();
        categoryList.forEach(c -> {
            log.info("{}",c);
//            log.info("{}", CommonUtils.toJson(c));
        });
//        productRepository.findAll().forEach(p -> log.info("{}", CommonUtils.toJson(p)));
    }

}
