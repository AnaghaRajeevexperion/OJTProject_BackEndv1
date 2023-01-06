package com.experion.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="products")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_code")
    private String product_code;

    @Column(name="product_name")
    private String product_name;

    @Column(name="product_price")
    private double product_price;

}
