package org.threadnew;

import lombok.extern.slf4j.Slf4j;

/**
 * 我的任务对象
 *
 * @author LENOVO
 * @since 2025/4/15 10:37
 */
@Slf4j
public class MyRunable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程:"+i);
        }
    }
}
