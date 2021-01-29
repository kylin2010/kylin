package com.atguigu.boot05web.service;

import com.atguigu.boot05web.Bean.Account;
import com.atguigu.boot05web.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author kylin
 * @description 业务逻辑类
 * @date 2021-01-28 23:02
 */
@Service
public class AccountService {

    @Autowired
    private AccountMapper accountMapper;

    public Account getAcctByid(Long id){
        return accountMapper.getAcct(id);
    }
}
