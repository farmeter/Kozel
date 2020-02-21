package com.farmeter.kozel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmeter.kozel.entity.Category;

public interface CateogoryRepository extends JpaRepository<Category, Long> {
}
