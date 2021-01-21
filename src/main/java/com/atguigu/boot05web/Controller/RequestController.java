package com.atguigu.boot05web.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wj
 */
@Controller
public class RequestController {

    @GetMapping("/goto")
    public String gotoPage(HttpServletRequest request){
        request.setAttribute("msg","你好啊啊");
        return "forward:/success";
    }

    @ResponseBody
    @GetMapping("/success")
    public Map<String,Object> success(@RequestAttribute(value = "msg",required = false) String msg,
                       HttpServletRequest request){

        Object msg1 = request.getAttribute("msg");
        HashMap<String, Object> map = new HashMap<>(3);

        Object hellow = request.getAttribute("hellow");
        Object world = request.getAttribute("world");
        Object message = request.getAttribute("message");

        map.put("uu2",hellow);
        map.put("uu1",msg1);
        map.put("world",world);

        return map;
    }

    @GetMapping("/params")
    public String testParam(Map<String,Object> map,
                            Model model,
                            HttpServletRequest request,
                            HttpServletResponse response){
        map.put("hellow","world666");
        model.addAttribute("world","hellow");
        request.setAttribute("message","hellowword");

        Cookie cookie =new Cookie("c1","v1");
        cookie.setDomain("localhost");
        return "forward:/success";
    }
}
