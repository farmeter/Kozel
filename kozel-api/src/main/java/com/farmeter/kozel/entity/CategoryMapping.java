package com.farmeter.kozel.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "CategoryMapping")
public class CategoryMapping {
    @Id
    @GeneratedValue
    private Long id;

    private Long categoryNo;

    private Long productNo;
}
