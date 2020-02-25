package com.farmeter.kozel.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Product")
public class Product extends Auditable {
    @Id
    @GeneratedValue
    private Long productNo;

    private String name;

    private Long originPrice;

    private Long salePrice;

    @OneToMany(mappedBy = "productNo")
//    @JoinColumn(name = "productNo")
    private List<CategoryMapping> categoryMappings;

}
