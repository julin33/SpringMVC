package com.julin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestFullController {
    //传统的： http://localhost:8080/add?a=1&b=2
    //restfull： http://localhost:8080/add?a=1&b=2
    //@RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.GET)

    @GetMapping("/add/{a}/{b}")
    public String test1(@PathVariable int a,@PathVariable int b, Model model){
        int res = a + b;
        model.addAttribute("msg","test1结果为" + res);
        return "test1";
    }

    @PostMapping("/add/{a}/{b}")
    public String test2(@PathVariable int a,@PathVariable int b, Model model){
        int res = a + b;
        model.addAttribute("msg","test2结果为" + res);
        return "test1";
    }
}
