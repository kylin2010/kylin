package com.atguigu.boot05web.service;

import com.atguigu.boot05web.Bean.Alarm;
import com.atguigu.boot05web.mapper.AlarmMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author kylin
 * @description 服务类
 * @date 2021-01-29 9:22
 */
@Service
public class AlarmService {

    @Autowired
    AlarmMapper alarmMapper;

    public Alarm getById(Long id){
        return alarmMapper.getAlarmById(id);
    }

    public Alarm saveAlarm(Alarm alarm){
        alarmMapper.insertAlarm(alarm);
        return alarm;
    }
}
