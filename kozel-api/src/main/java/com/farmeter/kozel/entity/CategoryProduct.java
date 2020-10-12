package com.farmeter.kozel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CategoryProduct")
public class CategoryProduct {

    @Id
    @GeneratedValue
    @Column
    private Long id;

    @OneToOne
    @JoinColumn(name = "productNo")
    private Product product;

    @OneToOne
    @JoinColumn(name = "categoryNo")
    private Category Category;

    //TODO

}