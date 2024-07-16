package thread.controller;

import java.util.concurrent.Callable;

/**
 * 自定义Callable，不是任务类
 *
 * @author LENOVO
 * @since 2024/7/15 10:53
 */
public class MyCallable implements Callable<String> {

    private int n;

    MyCallable(int n) {
        this.n = n;
    }

    int sum = 0;

    @Override
    public String call() throws Exception {

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return "线程求出了1-" + n + "的和是：" + sum;
    }
}
