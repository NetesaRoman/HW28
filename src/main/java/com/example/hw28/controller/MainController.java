package com.example.hw28.controller;

import com.example.hw28.dto.OrderDto;
import com.example.hw28.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


/*
 *
 * @author Roman Netesa
 *
 */
@RestController
public class MainController {

    @Autowired
    private OrderService orderService;


    @GetMapping(value = "/orders")
    public String showOrders() {
      StringBuilder result = new StringBuilder();
      List<OrderDto> orders = new ArrayList<>();
        orderService.findAll().forEach(orders::add);
      orders.forEach(order -> result.append(order.toString()));

      return result.toString();
    }

    @GetMapping("/orders/{id}")
    public String showOrdersByID(@PathVariable Integer id) {
        OrderDto order;
        order = orderService.findById(id);
        return order.toString();
    }


}
