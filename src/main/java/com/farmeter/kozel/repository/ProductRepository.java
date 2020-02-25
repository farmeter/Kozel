package com.farmeter.kozel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmeter.kozel.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
