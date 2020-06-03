package com.farmeter.kozel.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "CategoryProduct")
public class CategoryProduct {

    @OneToOne
    @Column(name = "productNo")
    private Product product;

    @OneToOne
//    @Column(name = "categoryNo")
//    @JoinColumn(map)
    private Category Category;

    //TODO

}