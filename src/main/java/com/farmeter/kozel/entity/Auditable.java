package com.farmeter.kozel.entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
abstract class Auditable {
    @CreationTimestamp
    private Date createDate;

    @UpdateTimestamp
    private Date updateDate;
}
