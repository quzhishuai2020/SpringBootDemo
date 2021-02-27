package com.qzs.springbootdemo;

import com.qzs.springbootdemo.filter.SecondFilter;
import com.qzs.springbootdemo.listener.SecondListener;
import com.qzs.springbootdemo.servlet.SecondServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * 整合servlet/filter/listener方法二启动类
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
//    @Bean
//    public FilterRegistrationBean getFilterRegistrationBean(){
//        FilterRegistrationBean filterBean = new FilterRegistrationBean<SecondFilter>(new SecondFilter());
//        filterBean.addUrlPatterns(new String[]{"*.do","/second"});
//        return filterBean;
//    }
    @Bean
    public ServletListenerRegistrationBean<SecondListener> getServletListenerRegistrationBean(){
        ServletListenerRegistrationBean<SecondListener> bean = new ServletListenerRegistrationBean<SecondListener>(new SecondListener());
        return bean;
    }
}
