package com.experion.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="products")
@Data
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_code")
    private String productCode;

    @Column(name="product_name")
    private String productName;

    @Column(name="product_price")
    private double productPrice;

    @Column(name="product_type")
    private String productType;

    @Column(name="picture")
    private String picture;

}
