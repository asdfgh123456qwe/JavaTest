package org.threadnew;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 线程相关方法
 *
 * @author LENOVO
 * @since 2025/4/17 16:09
 */
public class ThreadTest2 {

    private static final Logger log = LoggerFactory.getLogger(ThreadTest2.class);

    public static void main(String[] args) {

        Thread t1 = new MyThread("honey1");
//        t1.setName("honey1");
        t1.start();
        log.info(t1.getName());

        Thread t2 = new MyThread("honey2");
//        t2.setName("honey2");
        t2.start();
        log.info(t2.getName());


        // 主线程
        Thread thread = Thread.currentThread();
        thread.setName("honeyMain");
        log.info(thread.getName());

        for (int i = 1; i <=5 ; i++) {
            log.info("{}:{}",thread.getName(), i);
        }

    }
}
