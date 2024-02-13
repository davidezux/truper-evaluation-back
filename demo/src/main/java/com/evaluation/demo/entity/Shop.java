package com.evaluation.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Table(name = "shop", schema = "demo")
public class Shop {

    private long id;
    @Column(name = "custumer_id")
    private long custumerId;
}
