package com.qzs.springbootdemo;

import com.qzs.springbootdemo.servlet.SecondServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * 整合servlet方法二启动类
 */
@SpringBootApplication
public class App2 {
    public static void main(String[] args) {
        SpringApplication.run(App2.class,args);
    }

    @Bean
    public ServletRegistrationBean getServletRegistration(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new SecondServlet());
        bean.addUrlMappings("/second");
        return bean;

    }
}
