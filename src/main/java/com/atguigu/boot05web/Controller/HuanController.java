package com.atguigu.boot05web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HuanController {
    @RequestMapping("index1")
    public String inde(){
        return "index";
    }
}
