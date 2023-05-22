package com.ecommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;
    private String name;
    private String text;
    private double price;
    private int discount;
    private String image;
    private Date created;
    private int view;

    @ManyToOne
    @JoinColumn(name = "category_id",referencedColumnName = "category_id")
    private Category category;

    @OneToMany(mappedBy = "product")
    private List<OrderDetail> orderDetails;


}
