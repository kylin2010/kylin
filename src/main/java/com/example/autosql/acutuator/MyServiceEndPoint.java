package com.example.autosql.acutuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Map;

/**
 * @author kylin
 * @description 自定义的端口
 * @date 2021-01-31 22:23
 */
@Component
@Endpoint(id="myService1")
public class MyServiceEndPoint {

    @ReadOperation
    public Map getDockerInfo(){
        return Collections.singletonMap("docker","docker启动中中");
    }

    @WriteOperation
    public void stopDocker(){
        System.out.println("docker停止中》。。。。。。。");
    }
}
