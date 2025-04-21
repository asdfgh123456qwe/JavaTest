package com.threadpoolnew;

import lombok.extern.slf4j.Slf4j;

/**
 * 我的任务类
 *
 * @author LENOVO
 * @since 2025/4/21 14:12
 */
@Slf4j
public class MyRunable implements Runnable {
    @Override
    public void run() {
        log.info("{}===>输出666~~~", Thread.currentThread().getName());
        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
