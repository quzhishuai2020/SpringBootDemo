package com.qzs.springbootdemo.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


public class SecondListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("初始化listener2");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
