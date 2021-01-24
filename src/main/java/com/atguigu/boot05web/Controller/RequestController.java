package com.atguigu.boot05web.Controller;


import com.atguigu.boot05web.Bean.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wj
 */
@Slf4j
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

    @ResponseBody
    @PostMapping("/saveUser")
    public User  saveUser(User user){
        return user;
    }

    /**
     * mutipart自动封装上传文件
     * @param userName 用户名
     * @param headImage 上传头像
     * @param photos 生活照
     * @return
     */
    @PostMapping("/upload3")
    public String upload3(@RequestParam("userName") String userName,
                          @RequestPart("headImage") MultipartFile headImage,
                          @RequestPart("photos") MultipartFile[] photos) throws IOException {

        log.info("上传的信息:userName={},headImage={},photos={}",
                userName,headImage.getSize(),photos.length);

        if (!headImage.isEmpty()) {
            //保存到文件服务器，oss服务器
            String originalFilename = headImage.getOriginalFilename();
            headImage.transferTo(new File("F:\\"+originalFilename));
        }

        if (photos.length>0) {
            for (MultipartFile photo : photos) {
                if (!photo.isEmpty()) {
                    String originalFilename = photo.getOriginalFilename();
                    photo.transferTo(new File("F:\\"+originalFilename));
                }
            }
        }


        return "main";
    }
}
