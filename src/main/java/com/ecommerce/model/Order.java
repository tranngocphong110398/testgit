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
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long id;
    private String status;
    private String userName;
    private String userEmail;
    private String userPhone;
    private double total;
    private Date created;

    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetails;

    @ManyToOne()
    @JoinColumn(name = "user_id",referencedColumnName = "user_id")
    private User user;
}
