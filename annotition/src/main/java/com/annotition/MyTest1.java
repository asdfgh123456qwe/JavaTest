package com.annotition;

public @interface MyTest1 {

    public String aaa() default "123";

    public boolean bbb() default true;
}
