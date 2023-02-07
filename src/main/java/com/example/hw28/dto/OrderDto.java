package com.example.hw28.dto;

import com.example.hw28.model.Product;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

/*
 *
 * @author Roman Netesa
 *
 */
@Data
public class OrderDto {

    private Integer id;

    private LocalDate creationDate;

    private Double price;

    private List<Product> products;


}
