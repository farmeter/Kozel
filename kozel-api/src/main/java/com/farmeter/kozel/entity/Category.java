package com.farmeter.kozel.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "categoryMappings")
@Table(name = "Category")
public class Category {

    @Id
    @GeneratedValue
    private Long categoryNo;

    private String categoryName;

}
