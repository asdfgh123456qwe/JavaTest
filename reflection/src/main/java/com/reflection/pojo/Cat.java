package com.reflection.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * 猫猫类
 *
 * @author LENOVO
 * @since 2025/4/28 13:57
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Slf4j
public class Cat {

    public static int a;

    public static final String COUNTRY = "中国";

    private String name;

    private int age;

}
