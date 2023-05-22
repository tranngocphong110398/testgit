package com.ecommerce.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

    private Long id;
    private String status;
    private String userName;
    private String userEmail;
    private String userPhone;
    private double total;
    private Date created;
}
