package threadpool.controller;

import threadpool.service.MyCallable;

import java.util.concurrent.*;

/**
 * 线程池练习3
 *
 * @author LENOVO
 * @since 2024/7/26 17:24
 */
public class ThreadPool3 {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(17);
        // 计算密集型任务：核心线程数量 = CPU的核数 + 1
        // IO密集型任务：核心线程数量 = CPU核数 * 2
//        ExecutorService pool1 = Executors.newSingleThreadExecutor();
//        ExecutorService pool2 = Executors.newCachedThreadPool();
//        ScheduledExecutorService pool3 = Executors.newScheduledThreadPool(4);

        // 使用线程处理Callable任务
        Future<String> f1 = pool.submit(new MyCallable(100));
        Future<String> f2 = pool.submit(new MyCallable(200));
        Future<String> f3 = pool.submit(new MyCallable(300));
        Future<String> f4 = pool.submit(new MyCallable(400));

        try {
            System.out.println(f1.get());
            System.out.println(f2.get());
            System.out.println(f3.get());
            System.out.println(f4.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
