package com.example.hw28.dto;

import com.example.hw28.model.Order;
import lombok.Data;

/*
 *
 * @author Roman Netesa
 *
 */
@Data
public class ProductDto {
    private Integer id;

    private String name;

    private Double price;

    private Order order;
}
