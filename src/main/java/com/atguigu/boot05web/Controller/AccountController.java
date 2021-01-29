package com.atguigu.boot05web.Controller;

import com.atguigu.boot05web.Bean.Account;
import com.atguigu.boot05web.Bean.Alarm;
import com.atguigu.boot05web.service.AccountService;
import com.atguigu.boot05web.service.AlarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kylin
 * @description 测试吧
 * @date 2021-01-28 23:05
 */
@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private AlarmService alarmService;

    /**
     * 如果使用requestParam直接注释。直接用请求参数?连接
     * @param id 参数袖带
     * @return 返回一个
     */
    @GetMapping("/acct/{id}")
    public Account getById(@PathVariable("id") Long id){
        return accountService.getAcctByid(id);
    }

    @GetMapping("/alarm")
    public Alarm getAlarm(@RequestParam("id") Long id){

        return alarmService.getById(id);
    };
}
