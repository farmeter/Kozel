package com.farmeter.kozel.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Category")
public class Category {

    @Id
    @GeneratedValue
    @Column(name = "categoryNo")
    private Long categoryNo;

    @Column(name = "categoryName")
    private String categoryName;

    //FIXME
//    @OneToMany
//    @Column(name = "")
//    private List<CategoryProduct> categoryProductList;

}
