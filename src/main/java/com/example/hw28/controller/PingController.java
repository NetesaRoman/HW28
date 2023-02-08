package com.example.hw28.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *
 * @author Roman Netesa
 *
 */
@RestController
@Slf4j
public class PingController {

    @GetMapping("/ping")
    public ResponseEntity<Object> test() {
        log.info("OK");
        return ResponseEntity.ok("OK");
    }
}