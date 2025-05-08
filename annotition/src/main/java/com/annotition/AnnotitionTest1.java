package com.annotition;

/**
 * 注解测试类
 *
 * @author LENOVO
 * @since 2025/5/8 10:07
 */
@MyTest1(aaa = "123", bbb = false)
@MyTest2("56")
public class AnnotitionTest1 {

    @MyTest2("99")
    public void test1(){

    }
}
