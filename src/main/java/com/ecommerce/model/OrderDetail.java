package com.ecommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orderdetails")
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderdetail_id")
    private Long id;
    private int quantity;
    private double total;
    private  String status;

    @ManyToOne()
    @JoinColumn(name = "order_id", referencedColumnName = "order_id")
    private Order order;

    @ManyToOne()
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    private Product product;

}
