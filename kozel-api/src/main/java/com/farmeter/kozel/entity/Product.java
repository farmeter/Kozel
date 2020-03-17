package com.farmeter.kozel.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

@lombok.Getter
@lombok.Setter
@Builder
//@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString(exclude = "categoryMappings")
@Table(name = "Product")
public class Product extends Auditable {
    @Id
    @GeneratedValue
    private Long productNo;

    private String name;

    private Long originPrice;

    private Long salePrice;

    @OneToMany(mappedBy = "productNo", fetch = FetchType.LAZY)
    private List<CategoryMapping> categoryMappings;

}