package com.julin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

@Controller
public class EncodingController {
    @PostMapping("/e/t1")
    public String test1(String name, Model model)  {

        //过滤器解决乱码

        model.addAttribute("msg",name);
        return "test1";
    }

}
