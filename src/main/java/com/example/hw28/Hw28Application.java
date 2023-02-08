package com.example.hw28;


import com.example.hw28.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class Hw28Application  {

    @Autowired
    private OrderService orderService;


    public static void main(String[] args) {
        SpringApplication.run(Hw28Application.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void started(){
        orderService.createNewOrder();
        orderService.createNewOrder();
        orderService.createNewOrder();
    }

}
