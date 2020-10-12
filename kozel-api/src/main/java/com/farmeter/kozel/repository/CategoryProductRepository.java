package com.farmeter.kozel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmeter.kozel.entity.CategoryProduct;
import com.farmeter.kozel.entity.Product;

public interface CategoryProductRepository extends JpaRepository<CategoryProduct, Long> {
}
