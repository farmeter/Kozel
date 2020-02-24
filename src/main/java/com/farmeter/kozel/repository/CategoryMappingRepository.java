package com.farmeter.kozel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmeter.kozel.entity.CategoryMapping;

public interface CategoryMappingRepository extends JpaRepository<CategoryMapping, Long> {
}
