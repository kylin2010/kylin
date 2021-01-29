package com.atguigu.boot05web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author kylin
 * @description 测试themyleaf
 * @date 2021-01-25 22:41
 */
@Controller
public class ViewTestController {

    @GetMapping("/atguigu")
    public String atguitu(Model model){
        model.addAttribute("msg","哈哈哈");
        return "success1";
    }


}
