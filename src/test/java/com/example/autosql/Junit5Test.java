package com.example.autosql;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author kylin
 * @description junit5单元测试
 * @date 2021-01-31 18:02
 */
@DisplayName("可以给每个类加名字")
@SpringBootTest
public class Junit5Test {

    @Test
    @DisplayName("测试名字")
    void testDisplayName1(){
        System.out.println("正则测试中1");
    }

    @Test
    @DisplayName("测试名字2")
    void testDisplayName(){
        System.out.println("正则测试中2");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("测试就要开始了");
    }

    @AfterEach
    void afterEach(){
        System.out.println("测试就要结束了");
    }

    @BeforeAll
    static void bbeforeAll(){
        System.out.println("所有测试已经开始了");
    }

    @AfterAll
    static void bafterAll(){
        System.out.println("所有测试已经结束了");
    }
}
