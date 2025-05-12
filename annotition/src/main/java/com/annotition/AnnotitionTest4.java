package com.annotition;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * MyTest注解测试类
 *
 * @author LENOVO
 * @since 2025/5/9 10:35
 */
@Slf4j
public class AnnotitionTest4 {

 //   @MyTest
    public void test1(){
        log.info("========test1=========");
    }

    @MyTest
    public void test2(){
        log.info("========test2=========");
    }

 //   @MyTest
    public void test3(){
        log.info("========test3=========");
    }

    @MyTest
    public void test4(){
        log.info("========test4=========");
    }

    public static void main(String[] args) throws Exception {
        Class c = AnnotitionTest4.class;

        AnnotitionTest4 annotitionTest4 = new AnnotitionTest4();

        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTest.class)) {
                method.invoke(annotitionTest4);
            }
        }
    }

}
