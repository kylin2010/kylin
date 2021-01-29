package com.atguigu.boot05web.mapper;

import com.atguigu.boot05web.Bean.Account;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author kylin
 * @description 测试mapper接口
 * @date 2021-01-28 22:46
 */
@Mapper
public interface AccountMapper {

    public Account getAcct(Long id);
}
