package com.farmeter.kozel.repository;

import org.junit.Test;

import com.farmeter.kozel.AbstractBaseTest;
import com.farmeter.kozel.entity.Product;
import com.farmeter.kozel.util.CommonUtils;

public class CommonUtilTest extends AbstractBaseTest {
    @Test
    public void test() {
        Product sample = Product.builder().name("productName1").originPrice(100L).salePrice(50L).build();
        System.out.println(sample);
        System.out.println(CommonUtils.toJson(sample));
    }
}
