package com.annotition;

/**
 * 测试自定义注解3
 *
 * @author LENOVO
 * @since 2025/5/8 15:46
 */
@MyTest3(value = "111", bbb = {"222"})
public class Demo {

    @MyTest3(value = "孙悟空", aaa = 99.9, bbb = {"牛夫人"})
    public void test(){

    }
}
