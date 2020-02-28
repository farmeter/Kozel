package com.farmeter.kozel;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.farmeter.kozel.config.SampleData;
import com.farmeter.kozel.entity.Product;
import com.farmeter.kozel.repository.ProductRepository;
import com.farmeter.kozel.util.CommonUtils;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class ProductRepositoryTest {

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
