package com.example.hw28.config;

import com.example.hw28.servlet.MyDispatcherListener;
import com.example.hw28.servlet.MyDispatcherServlet;
import jakarta.servlet.ServletContextListener;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 *
 * @author Roman Netesa
 *
 */
@Configuration
public class ServletConfig {
    @Bean
    public ServletRegistrationBean myDispatcherServletBean() {
        ServletRegistrationBean bean = new ServletRegistrationBean(new MyDispatcherServlet(), "/dispatcher");
        return bean;
    }

    @Bean
    public ServletListenerRegistrationBean<ServletContextListener> myDispatcherListenerBean() {
        ServletListenerRegistrationBean<ServletContextListener> bean = new ServletListenerRegistrationBean();
        bean.setListener(new MyDispatcherListener());
        return bean;
    }

}
