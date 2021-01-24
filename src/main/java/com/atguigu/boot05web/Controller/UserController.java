package com.atguigu.boot05web.Controller;


import com.atguigu.boot05web.Bean.User;
import com.atguigu.boot05web.exception.UserToManyException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author wj
 */
@RestController
public class UserController {
public static final int PEOPLE_COUNT=3;

    /**
     * @RequestMapping(value="/user",method = RequestMethod.GET)上面的等同于下面的注释
     * @param model 数据
     * @return 视图
     */
    @GetMapping("/user")
    public String getUser( Model model){
        List<User> users =Arrays.asList(new User(1),
                new User(2),
                new User(3));
        model.addAttribute("users",users);
        if (users.size()>PEOPLE_COUNT) {
            throw new UserToManyException();
        }
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
