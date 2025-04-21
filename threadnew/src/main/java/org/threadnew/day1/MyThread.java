package org.threadnew.day1;

import lombok.extern.slf4j.Slf4j;

/**
 * 线程练习
 *
 * @author LENOVO
 * @since 2025/4/14 17:19
 */
@Slf4j
public class MyThread extends Thread{

    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {

        String name = Thread.currentThread().getName();

        for (int i = 1; i <= 5; i++) {
            log.info("{}线程:{}", name, i);
        }
    }

}
