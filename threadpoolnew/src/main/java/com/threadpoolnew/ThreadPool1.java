package com.threadpoolnew;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.*;

/**
 * 线程池练习1
 *
 * @author LENOVO
 * @since 2025/4/21 11:10
 */
public class ThreadPool1 {

    private static final Logger log = LoggerFactory.getLogger(ThreadPool1.class);

    public static void main(String[] args) {

        ExecutorService pool = new ThreadPoolExecutor(3,
                5,
                8,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(4),  // 最多缓存四个任务队列
                Executors.defaultThreadFactory(),   // 默认的线程工厂
                new ThreadPoolExecutor.CallerRunsPolicy());

        Runnable target = new MyRunable();

        pool.execute(target);  // 核心线程
        pool.execute(target);  // 核心
        pool.execute(target);  // 核心
        pool.execute(target);  // 任务队列
        pool.execute(target);  // 任务队列
        pool.execute(target);  // 任务队列
        pool.execute(target);  // 任务队列
        pool.execute(target);  // 临时线程
        pool.execute(target);  // 临时线程
        pool.execute(target);  // 新任务的拒绝策略


        pool.shutdown();
    }

}
