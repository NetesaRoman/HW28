package com.example.hw28.servlet;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import lombok.extern.slf4j.Slf4j;

/*
 *
 * @author Roman Netesa
 *
 */
@Slf4j
public class MyDispatcherListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("DispatcherListener is initialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("DispatcherListener is destroyed");
    }
}
