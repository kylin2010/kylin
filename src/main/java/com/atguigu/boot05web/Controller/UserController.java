package com.atguigu.boot05web.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

//    @RequestMapping(value="/user",method = RequestMethod.GET)
    //上面的等同于下面的注释
    @GetMapping("/user")
    public String getuser(){
        return "GET=张三";
    }

    @RequestMapping(value="/user",method = RequestMethod.DELETE)
    public String deleteUser(){
        return "DELETE-h";
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String postUser(){
        return "POST-lisi";
    }

    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String putUser(){
        return "PUT-d";
    }
}
