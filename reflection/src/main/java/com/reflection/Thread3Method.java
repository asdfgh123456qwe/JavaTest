package com.reflection;

import com.reflection.pojo.Cat;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 反射练习3
 *
 * @author LENOVO
 * @since 2025/4/30 14:21
 */
@Slf4j
public class Thread3Method {
    @Test
    public void testGetMethods() throws Exception {
        Class c1 = Cat.class;
//        Method[] methods = c1.getMethods();
//        Method[] methods = c1.getDeclaredMethods();
//        for (Method method : methods) {
//            log.info("方法名:{}, 参数个数:{}, 返回值类型:{}",method.getName(), method.getParameterCount(), method.getReturnType());
//        }

    //    Method setAge = c1.getMethod("setAge");

        Method setAge = c1.getDeclaredMethod("setAge", int.class);
//        log.info("方法名:{}, 参数个数:{}, 返回值类型:{}",setAge.getName(), setAge.getParameterCount(), setAge.getReturnType());

        Field ageField = c1.getDeclaredField("age");
        ageField.setAccessible(true);
//        log.info("获取年龄属性:{}, 获取年龄类型:{}", ageField.getName(), ageField.getType());


        Cat cat = new Cat();
        setAge.setAccessible(true);
        setAge.invoke(cat, 2);


        int age = (int) ageField.get(cat);

        log.info("age:{}", age);

    }
}
