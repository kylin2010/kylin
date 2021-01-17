package com.atguigu.boot05web.Controller;

import com.atguigu.boot05web.Bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {


    public Car car;
    @Autowired
    public void setCar(Car car) {
        this.car = car;
    }

    @RequestMapping("hh")
    public String hel(){
        return "nihao1!";
    }

    @RequestMapping("liu")
    public Car liuliu(){
        return car;
    }
}
