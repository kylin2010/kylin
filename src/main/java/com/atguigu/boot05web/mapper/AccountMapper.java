package com.atguigu.boot05web.mapper;

import com.atguigu.boot05web.Bean.Account;

/**
 * @author kylin
 * @description 测试mapper接口
 * @date 2021-01-28 22:46
 *
 * 在springbootapplication中标注mapperscan(basepackage)就不需要标注mapper了
 */
//@Mapper
public interface AccountMapper {

    public Account getAcct(Long id);
}
