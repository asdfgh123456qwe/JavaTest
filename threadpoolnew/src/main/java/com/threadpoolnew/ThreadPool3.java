package com.threadpoolnew;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 线程池练习3
 *
 * @author LENOVO
 * @since 2025/4/21 17:28
 */
@Slf4j
public class ThreadPool3 {
    public static void main(String[] args) throws Exception {

        ExecutorService pool = Executors.newFixedThreadPool(17);

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
