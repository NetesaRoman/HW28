package com.example.hw28;

import com.example.hw28.controller.MainController;
import com.example.hw28.controller.PingController;
import com.example.hw28.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class Hw28Application extends SpringBootServletInitializer {

    @Autowired
    private OrderService orderService;

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
        return builder.sources(PingController.class, MainController.class);
    }

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
