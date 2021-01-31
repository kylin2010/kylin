package com.example.autosql;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author kylin
 * @description junit5单元测试
 * @date 2021-01-31 18:02
 * springtest可以从容器中国取
 */
@DisplayName("可以给每个类加名字")
@SpringBootTest
public class Junit5Test {

    @Test
    @DisplayName("测试名字")
    void testDisplayName1(){
        System.out.println("正则测试中1");
    }

    @Disabled
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

    /**
     * 设置超时时间
     * @throws InterruptedException
     */
    @Timeout(value = 500,unit = TimeUnit.MILLISECONDS)
    @Test
    void testTimeOut() throws InterruptedException {
        Thread.sleep(600);
    }

    @RepeatedTest(5)
    @Test
    void testRepeat(){
        System.out.println("5");
    }

    /**
     * 前边的额断言失败，后面的代码不会执行
     */
    @Test
    @DisplayName("测试断言")
    void testAssersions(){

        Assertions.assertEquals(5,cal(2,3),"业务逻辑计算错误");

        Object o = new Object();
        Object o1 = new Object();
        Assertions.assertSame(o,o1,"对象不是同一个");


    }

    int cal(int a,int b){
        return a+b;
    }

    @DisplayName("测试数组是否相等")
    @Test
    void testArrays(){
        Assertions.assertArrayEquals(new int[]{2,3},new int[]{2,3});
    }

    @DisplayName("组合断言")
    @Test
    void testAll(){
        assertAll("test",()->assertTrue(true&&true,"结果不是true"),
                ()->assertEquals(6,cal(2,4),"预期数值和计算出来不一致"));
    }

    /**
     * 断定一定出现异常
     */
    @DisplayName("异常断言")
    @Test
    void testException(){
        assertThrows(ArithmeticException.class,()->{int i=10/2;});
    }

    @Test
    void testFail(){
        if(2==2){
            fail("快速失败");
        }
    }
}
