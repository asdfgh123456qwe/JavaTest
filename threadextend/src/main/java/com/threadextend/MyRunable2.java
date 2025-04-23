package com.threadextend;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 任务
 *
 * @author LENOVO
 * @since 2025/4/23 16:29
 */
@Slf4j
public class MyRunable2 implements Runnable {

    private int count;

    private final Lock lk = new ReentrantLock();

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            try {
                lk.lock();
                log.info("count =========> {}", ++count);
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                lk.unlock();
            }

        }

    }
}
