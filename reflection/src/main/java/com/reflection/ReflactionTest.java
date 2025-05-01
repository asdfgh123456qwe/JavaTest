package com.reflection;

import com.reflection.pojo.Student;
import lombok.extern.slf4j.Slf4j;

/**
 * 反射测试
 *
 * @author LENOVO
 * @since 2025/4/25 10:51
 */
@Slf4j
public class ReflactionTest {

    public static void main(String[] args) throws Exception {
        Class c1 = Student.class;
        log.info("类的名字:{}", c1.getName());  // 全类名
        log.info("类的简名:{}", c1.getSimpleName());

        Class c2 = Class.forName("com.reflection.pojo.Student");
        log.info("{}",c1 == c2);

        Student student = new Student();

        Class c3 = student.getClass();
    }

}
