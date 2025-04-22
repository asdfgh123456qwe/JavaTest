package com.threadpoolnew;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;

/**
 * callable接口练习
 *
 * @author LENOVO
 * @since 2025/4/17 13:57
 */
@Slf4j
public class MyCallable implements Callable<String> {

    private int n;

    private int sum = 0;

    MyCallable(int n){
        this.n = n;
    }


    @Override
    public String call() throws Exception {

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return "线程" + Thread.currentThread().getName() + "计算1-" + n + "得出的和为：" + sum;
    }
}
