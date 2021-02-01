package com.example.profile.controller;

import com.example.profile.bean.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kylin
 * @description 测试各个生产环境
 * @date 2021-02-01 18:47
 */

@RestController
public class HelloController {

    @Value("${person.name:李四}")
    private String name;

    @GetMapping("/")
    public String hello(){
        return "Hello:"+name;
    }

    @Autowired
    private People people;

    @GetMapping("/rr")
    public String iy(){
        return people.getClass().toString();
    }
}
