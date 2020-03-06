package com.farmeter.kozel.repository;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

import com.farmeter.kozel.AbstractBaseTest;
import com.farmeter.kozel.entity.Product;
import com.farmeter.kozel.util.CommonUtils;

@Slf4j
public class CommonUtilTest extends AbstractBaseTest {

    @Test
    public void test() {
        Product sample = Product.builder().name("productName1").originPrice(100L).salePrice(50L).build();
        log.info("{}" , sample);
        log.info("{}" , CommonUtils.toJson(sample));
    }
}
