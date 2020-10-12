package com.farmeter.kozel.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@ToString(exclude = "categoryMappings")
@Table(name = "Product")
public class Product extends Auditable {
    @Id
    @GeneratedValue
    private Long productNo;

    private String name;

    private Long originPrice;

    private Long salePrice;

    @Transient
    private List<Long> categoryIds;

}
