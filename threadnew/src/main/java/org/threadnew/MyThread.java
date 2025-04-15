package org.threadnew;

import lombok.extern.slf4j.Slf4j;

/**
 * 线程练习
 *
 * @author LENOVO
 * @since 2025/4/14 17:19
 */
@Slf4j
public class MyThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            log.info("ggg");
        }
    }

}
