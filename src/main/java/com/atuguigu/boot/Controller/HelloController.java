package com.atuguigu.boot.Controller;


import com.atuguigu.boot.bean.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ResponseBody和@Controller共同组成@restcontorller
 */
@Slf4j
@RestController
public class HelloController {

    @Autowired
    Car car;

    @RequestMapping("car")
    public Car car(){
        return car;
    }

    @RequestMapping("hello4")
    public String hand01(){

        log.info("请求进来了");
        return "hello springboot!"+"你好";
    }
}
