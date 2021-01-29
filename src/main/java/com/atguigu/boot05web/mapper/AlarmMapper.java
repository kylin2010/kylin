package com.atguigu.boot05web.mapper;

import com.atguigu.boot05web.Bean.Alarm;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

/**
 * @author kylin
 * @description 注释
 * @date 2021-01-29 9:16
 */
//@Mapper
public interface AlarmMapper {


    /**
     * 必须加上javac注释
     * @param id 厉害
     * @return 好烦
     */
    @Select("select * from alarm where alarmId =#{id}")
    public Alarm getAlarmById(Long id);

    /**
     * 插入语句.也可以用option变成自增
     * @param alarm 实体类
     */
    @Insert("insert into Alarm (alarmNo,date,content) values (#{alarmNo},#{date},#{content})")
    @Options(useGeneratedKeys = true,keyProperty = "alarmId")
    public void insertAlarm(Alarm alarm);
}
