package com.example.hw28.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.time.LocalDateTime;


/*
 *
 * @author Roman Netesa
 *
 */
@Slf4j
public class MyDispatcherServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.info("DispatcherServlet doGet() method is invoked");
        resp.setContentType("text/plain");
        resp.setStatus(200);
        resp.getWriter().println("Result " + LocalDateTime.now());
        resp.getWriter().close();
    }

    @Override
    protected void doPost( HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.info("DispatcherServlet doPost() method is invoked");
    }
}
