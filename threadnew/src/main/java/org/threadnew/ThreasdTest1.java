package org.threadnew;

import lombok.extern.slf4j.Slf4j;

/**
 * 线程类调动
 *
 * @author LENOVO
 * @since 2025/4/14 17:21
 */
@Slf4j
public class ThreasdTest1 {

    public static void main(String[] args) {

        // 创建MyThread线程类表示一个线程
        Thread myThread = new MyThread();

        // 启动线程
        myThread.start();

        for (int i = 0; i < 100; i++) {
            log.info("主线程:" + i);
        }
    }

}
