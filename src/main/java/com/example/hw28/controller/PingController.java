package com.example.hw28.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *
 * @author Roman Netesa
 *
 */
@RestController
public class PingController {

    @GetMapping(value = "/ping")
    public String ping(){
        return "OK";
    }
}
