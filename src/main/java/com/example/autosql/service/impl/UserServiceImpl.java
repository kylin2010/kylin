package com.example.autosql.service.impl;

import com.example.autosql.service.IUserService;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

/**
 * @author kylin
 * @description
 * @date 2021-01-31 22:13
 */
public class UserServiceImpl implements IUserService {

    private  Counter counter;

    public UserServiceImpl(MeterRegistry registry) {
        counter = registry.counter("user.registry.count");
    }

    @Override
    public void saveUser() {
        counter.increment();
        //保存
    }
}
