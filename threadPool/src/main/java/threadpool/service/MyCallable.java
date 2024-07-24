package threadpool.service;

import java.util.concurrent.Callable;

/**
 * Callable任务类
 *
 * @author LENOVO
 * @since 2024/7/24 16:04
 */
public class MyCallable implements Callable {

    private int n;

    public MyCallable(int n){
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return "线程求出了1-" + n + "的和是：" + sum;
    }
}
