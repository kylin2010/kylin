package com.atuguigu.boot.config;


import com.atuguigu.boot.bean.Pet;
import com.atuguigu.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类也是一个组件
 */
//告诉springboot这是一个配置类---
//springboot2最大的更新。little和full。如果单单注册组件。组件中没有相互依赖，就用false。这样会跳过检查，容器启动非常快
@Configuration(proxyBeanMethods = true)
public class Myconfig {

    @Bean   //给容器添加组件，以方法名作为id。返回类型就是组件类型。返回对象就是容器中保存的实例
    public User user01(){
        return new User("张三",14);
    }


    @Bean("tom")    //可以给组件id命名。  组件默认是单实例
    public Pet tomcatPet(){
        return new Pet("tomcat");
    }
}
