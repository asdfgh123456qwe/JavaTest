package com.reflection.pojo;

/**
 * cdd
 *
 * @author LENOVO
 * @since 2025/4/27 8:38
 *
 * 枚举类使用方法
 */
public enum TestEnum {

    TEST_ELEC_TYPE("12345");

    private final String id;

    TestEnum(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
