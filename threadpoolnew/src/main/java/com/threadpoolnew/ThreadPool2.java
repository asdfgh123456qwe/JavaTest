package com.threadpoolnew;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

/**
 * 线程池练习2
 *
 * @author LENOVO
 * @since 2025/4/21 15:26
 */
@Slf4j
public class ThreadPool2 {

    public static void main(String[] args) throws Exception {

        ExecutorService pool = new ThreadPoolExecutor(3,
                5,
                8,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(4),  // 最多缓存四个任务队列
                Executors.defaultThreadFactory(),   // 默认的线程工厂
                new ThreadPoolExecutor.CallerRunsPolicy());

        Future<String> f1 = pool.submit(new MyCallable(100));
        Future<String> f2 = pool.submit(new MyCallable(200));
        Future<String> f3 = pool.submit(new MyCallable(300));
        Future<String> f4 = pool.submit(new MyCallable(400));

        log.info(f1.get()); // 核心
        log.info(f2.get()); // 核心
        log.info(f3.get()); // 核心
        log.info(f4.get()); // 任务队列

    }
}
