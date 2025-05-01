package com.reflection;

import com.reflection.pojo.Cat;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;


/**
 * 反射测试类2
 *
 * @author LENOVO
 * @since 2025/4/28 14:00
 */
@Slf4j
public class Test2Constructor {

    @Test
    public void testGetConstructors(){
        Class c1 = Cat.class;
//        Constructor[] constructors = c1.getConstructors();
        Constructor[] constructors = c1.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            log.info("构造器名字:{}, 构造器的参数个数:{}", constructor.getName(), constructor.getParameterCount());
        }
    }

    @Test
    public void testGetConstructor() throws Exception {
        Class c1 = Cat.class;
//        Constructor constructor = c1.getConstructor();
        Constructor constructor = c1.getDeclaredConstructor();
        log.info("构造器名字:{}, 构造器的参数个数:{}", constructor.getName(), constructor.getParameterCount());

        constructor.setAccessible(true);
        Cat cat = (Cat) constructor.newInstance();

        log.info("{}",cat);

//        Constructor constructor1 = c1.getConstructor(String.class, Integer.class);

        Constructor constructor1 = c1.getDeclaredConstructor(String.class, Integer.class);
        log.info("构造器名字:{}, 构造器的参数个数:{}", constructor1.getName(), constructor1.getParameterCount());
    }

    @Test
    public void testField() throws Exception {
        Class c1 = Cat.class;
        Field[] fields = c1.getDeclaredFields();
//        for (Field field : fields) {
//            log.info("属性名为：{}, 属性类型为:{}", field.getName(), field.getType());
//        }

        Field name = c1.getDeclaredField("name");
        log.info("属性名:{}, 属性类型:{}", name.getName(), name.getType());

        Field age = c1.getDeclaredField("age");
        log.info("属性名:{}, 属性类型:{}", age.getName(), age.getType());

        Cat cat = new Cat();
        name.setAccessible(true);
        name.set(cat, "加菲猫");
        log.info("{}", cat);

        String s = (String) name.get(cat);
        log.info("成员变量的值为:{}", s);
    }
}
