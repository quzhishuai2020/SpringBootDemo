package com.qzs.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 整合servlet/filter/listener 方法一扫描
 */
@SpringBootApplication
@ServletComponentScan//启动时扫描@WebServlet
public class App1 {

    public static void main(String[] args) {
        SpringApplication.run(App1.class, args);
    }

}
