package com.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserDto {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String password;
    private Date created;

}
