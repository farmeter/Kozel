package com.farmeter.kozel;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.farmeter.kozel.repository.ProductRepository;
import com.farmeter.kozel.util.CommonUtils;

public class ProductRepositoryTest {

    @Autowired
    ProductRepository productRepository;

    @Test
    public void test() {
        System.out.println("===test start");
        System.out.println(CommonUtils.toJson(productRepository.findAll()));
    }
}
