package com.atguigu.boot05web.mapper;

import com.atguigu.boot05web.Bean.Alarm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author kylin
 * @description 注释
 * @date 2021-01-29 9:16
 */
@Mapper
public interface AlarmMapper {


    /**
     * 必须加上javac注释
     * @param id
     * @return
     */
    @Select("select * from alarm where alarmId =#{id}")
    public Alarm getAlarmById(Long id);
}
