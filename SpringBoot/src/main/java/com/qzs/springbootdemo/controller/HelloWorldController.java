package com.qzs.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    @ResponseBody
    public Map<String,Object> showHelloWorld() {

        Map<String,Object> result = new HashMap<>();
        result.put("msg","Hello world!");
        return result;
    }

}
