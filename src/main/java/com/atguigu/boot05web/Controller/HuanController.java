package com.atguigu.boot05web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wj
 */
@Controller
public class HuanController {
    @RequestMapping("/index")
    public String inde(){
        return "index2";
    }

   @GetMapping(value = {"/","/login"})
    public String login(){
        return "login1";
   }
}
