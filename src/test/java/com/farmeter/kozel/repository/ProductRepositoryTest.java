package com.farmeter.kozel.repository;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.farmeter.kozel.AbstractBaseTest;
import com.farmeter.kozel.config.SampleData;
import com.farmeter.kozel.entity.Product;
import com.farmeter.kozel.util.CommonUtils;

public class ProductRepositoryTest extends AbstractBaseTest {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private SampleData sampleData;

    @Before
    public void before() {
        System.out.println("====before");
        sampleData.doSample();
    }

    @Test
    public void findallTest() {
        System.out.println("===findallTest start");
        System.out.println(CommonUtils.toJson(productRepository.findAll()));
    }

    @Test
    public void saveTest() {
        System.out.println("===saveTest start");
        System.out.println(productRepository.save(Product.builder().name("productName1").originPrice(100L).salePrice(50L).build()));
    }

}
