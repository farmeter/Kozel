package com.farmeter.kozel.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "CategoryProduct")
public class CategoryProduct {

    @ManyToOne
    @Column(name = "productNo")
    private List<Product> products;

    @ManyToOne
    @Column(name = "categoryNo")
    private List<Category> Categories;

    //TODO

}