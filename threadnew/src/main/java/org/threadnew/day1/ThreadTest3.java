package org.threadnew.day1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 掌握sleep方法，join方法的作用
 *
 * @author LENOVO
 * @since 2025/4/17 16:46
 */
public class ThreadTest3 {
    private static final Logger log = LoggerFactory.getLogger(ThreadTest3.class);

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 5 ; i++) {
            log.info("{}", i);
            if (i == 3){
                Thread.sleep(5000);
            }
        }


        Thread t1 = new MyThread("1号线程");
        t1.start();
        t1.join();

        Thread t2 = new MyThread("2号线程");
        t2.start();
        t2.join();

        Thread t3 = new MyThread("3号线程");
        t3.start();
        t3.join();

    }
}
