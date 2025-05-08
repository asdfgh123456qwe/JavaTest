package com.reflection;

import java.lang.reflect.Field;

/**
 * 对象框架
 *
 * @author LENOVO
 * @since 2025/5/1 15:58
 */
public class ObjectFrame {
    public static void setObject(Object obj) throws Exception {
        Class c = obj.getClass();
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            String name = field.getName();
            field.setAccessible(true);
            String value = (String) field.get(obj);
        }
    }
}
