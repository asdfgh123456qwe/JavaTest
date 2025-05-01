package com.reflection.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 学生类
 *
 * @author LENOVO
 * @since 2025/4/25 10:56
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {

    private String id;

    private String name;

    private char gender;

}
