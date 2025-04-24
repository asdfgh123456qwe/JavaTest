package com.test.threadtest;

import com.test.threadtest.target.Test1Runnable;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutionException;

/**
 * 线程练习1
 *
 * @author LENOVO
 * @since 2025/4/24 8:53
 */
@Slf4j
public class Test1 {

    public static void main(String[] args) throws Exception {

        Runnable target = new Test1Runnable();

        new Thread(target, "小红").start();

        new Thread(target, "小明").start();

    }
}
