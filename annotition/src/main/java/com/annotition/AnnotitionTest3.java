package com.annotition;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 注解三使用测试类
 *
 * @author LENOVO
 * @since 2025/5/8 16:09
 */
@Slf4j
public class AnnotitionTest3 {

    @Test
    public void parseClass(){
        Class c = Demo.class;
        if (c.isAnnotationPresent(MyTest3.class)){
            MyTest3 test3 = (MyTest3) c.getDeclaredAnnotation(MyTest3.class);
            log.info("test3.value()===============>{}", test3.value());
            log.info("test3.aaa()===============>{}", test3.aaa());
            log.info("test3.bbb()===============>{}", Arrays.toString(test3.bbb()));
        }
    }

    @Test
    public void parseMethod() throws Exception {
        Class c = Demo.class;
        Method test = c.getDeclaredMethod("test");
        if (test.isAnnotationPresent(MyTest3.class)){
            MyTest3 test3 = (MyTest3) test.getDeclaredAnnotation(MyTest3.class);
            log.info("test3.value()===============>{}", test3.value());
            log.info("test3.aaa()===============>{}", test3.aaa());
            log.info("test3.bbb()===============>{}", Arrays.toString(test3.bbb()));
        }
    }
}
