package com.atguigu.boot05web.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wj
 */

@RestController
public class ParamTestContorller {

    @GetMapping("/car/{id}/owner/{username}")
    public Map<String,Object> getCar(@PathVariable("id") Integer id,
                                     @PathVariable("username") String name,
                                     @PathVariable Map<String,String> pv,
                                     @RequestHeader("User-Agent") String userAgent,
                                     @RequestHeader Map<String,String> headers,
                                     @RequestParam("age") Integer age){
        HashMap<String, Object> map = new HashMap<>(9);
        map.put("id",id);
        map.put("name",name);
        map.put("pv",pv);

        map.put("age",age);

        map.put("userAgent",userAgent);
        map.put("headers",headers);

        return map;
    }

    @PostMapping("/save")
    public Map<String, Object>  addCar(@RequestBody String content){
        HashMap<String, Object> map = new HashMap<>(2);
        map.put("content",content);
        return map;
    }

    @PostMapping("/save1")
    public Map<String, Object>  addCar1(@RequestParam("uu") String uu,
                       @RequestParam("pp") String pp){
        HashMap<String, Object> map = new HashMap<>(3);
        map.put("uu",uu);
        map.put("pp",pp);
        return map;
    }

    /**
     *
     * @param low 矩阵变量
     * @param path 路径中取值
     * @return 返回一个map
     *
     */

    @GetMapping("/cars/{path}")
    public Map<String, Object> carsell(@MatrixVariable("low") Integer low,
                                       @PathVariable("path") String path){
        //cars/sell;low=32;brand=yd,an,aa
        HashMap<String, Object> map = new HashMap<>(2);
        map.put("low",low);
        return map;
    }



}
