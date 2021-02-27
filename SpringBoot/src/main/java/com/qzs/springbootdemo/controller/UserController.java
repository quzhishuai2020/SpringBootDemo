package com.qzs.springbootdemo.controller;

import com.qzs.springbootdemo.projo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * 整合jspcontroller
 */
@Controller
public class UserController {

    @RequestMapping("/showUser")
    public String showUser(Model model){

        List<Users> list = new ArrayList<Users>();
        list.add(new Users(1,"张三",20));
        list.add(new Users(2,"李斯",21));
        list.add(new Users(3,"王五",23));


        model.addAttribute("list",list);
        System.out.println("准备返回");
        //跳转视图
        return "userList";

    }

}
