package org.threadnew.day1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Callable;

/**
 * callable接口练习
 *
 * @author LENOVO
 * @since 2025/4/17 13:57
 */
public class MyCallable implements Callable<String> {

    private static final Logger log = LoggerFactory.getLogger(MyCallable.class);
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
        return "线程得出的和为：" + sum;
    }
}
