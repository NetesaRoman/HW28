package com.example.hw28.service;

import com.example.hw28.dto.OrderDto;
import com.example.hw28.dto.ProductDto;
import com.example.hw28.model.Order;
import com.example.hw28.model.Product;
import com.example.hw28.repository.OrderRepository;
import com.example.hw28.repository.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
 *
 * @author Roman Netesa
 *
 */
@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;



    public OrderDto createNewOrder(){
        Order order = new Order();
        order.setCreationDate(LocalDate.now());
        order.setPrice(0d);
        orderRepository.save(order);
        OrderDto orderDto = new OrderDto();
        orderDto.setId(order.getId());
        orderDto.setPrice(order.getPrice());
        orderDto.setCreationDate(order.getCreationDate());
        return orderDto;
    }

    public ProductDto addProduct(Integer orderID, ProductDto productDto){
        Product product = new Product();
        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());
        Optional<Order> order = orderRepository.findById(orderID);
        product.setOrder(order.orElseThrow(() -> new EntityNotFoundException("No Order!")));
        productDto.setId(product.getId());
        productRepository.save(product);
        productDto.setId(product.getId());
        productDto.setOrder(product.getOrder());

        return productDto;
    }

    public OrderDto findById(Integer id){
        Order order = orderRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("No Order!"));
        OrderDto orderDto = new OrderDto();
        orderDto.setCreationDate(order.getCreationDate());
        orderDto.setPrice(order.getPrice());
        orderDto.setProducts(order.getProducts());
        orderDto.setId(order.getId());

        return orderDto;
    }

    public List<OrderDto> findAll(){
        ArrayList<OrderDto> result = new ArrayList<>();
        orderRepository.findAll().forEach(o ->{
            OrderDto orderDto = new OrderDto();
            orderDto.setCreationDate(o.getCreationDate());
            orderDto.setPrice(o.getPrice());
            orderDto.setProducts(o.getProducts());
            orderDto.setId(o.getId());
            result.add(orderDto);
        });
        return result;
    }

    public void deleteOrder(Integer id){
        Order target = orderRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("No Order!"));
        orderRepository.delete(target);
    }
}
