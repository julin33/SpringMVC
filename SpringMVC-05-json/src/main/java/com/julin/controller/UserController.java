package com.julin.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.julin.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Controller
@RestController
public class UserController {
//    @RequestMapping(value = "/j1",produces = "application/json;charset=utf-8") 手动配置编码
    @RequestMapping("/j1")
//    @ResponseBody //他就不会走视图解析器，直接返回字符串
    public String json1() throws JsonProcessingException {
        //jackson objectMapper
        ObjectMapper mapper = new ObjectMapper();
        //创建一个对象
        User user = new User("julin1", 10, "男");
        String str = mapper.writeValueAsString(user);

        return str;
    }

    @RequestMapping("/j2")
    public String json2() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        User user1 = new User("julin1", 10, "男");
        User user2 = new User("julin2", 10, "男");
        User user3 = new User("julin3", 10, "男");
        User user4 = new User("julin4", 10, "男");
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);

        String str = mapper.writeValueAsString(list);

        return str;
    }

    @RequestMapping("/j3")
    public String json3() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");

        return mapper.writeValueAsString(sdf.format(date));
    }
}
