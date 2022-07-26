package com.julin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//代表这个类被Spring接管
//被这注解的类中的所有方法，如果返回值时String，并且有具体的页面可以跳转，那么就会被视图解析器解析
public class ControllerTest2 {
    @RequestMapping("/t2")
    public String test2(Model model){
        model.addAttribute("msg","ControllerTest2");
        return "test1";
    }
}
