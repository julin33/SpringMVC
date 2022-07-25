package com.julin.controller;

import com.julin.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

    //localhost:8080/user/t1?name=xxx
    @GetMapping("/t1")
    public String test1(@RequestParam("username") String name, Model model){
        //1. 接受前端参数
        System.out.println("接受到前端的参数为" + name);
        //2. 将返回的结果传递给前端 model
        model.addAttribute("msg" ,name);
        //3. 跳转视图
        return "test1";
    }

    //前端接受的是一个对象： id age name
    @GetMapping("/t2")
    public String test2(User user){
        System.out.println(user);
        return "test1";
    }

    @GetMapping("/t3")
    public String test3(ModelMap map){
        map.addAttribute("msg","ModelMap");
        return "test1";
    }
}
