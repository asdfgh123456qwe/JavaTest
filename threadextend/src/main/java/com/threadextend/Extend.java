package com.threadextend;

/**
 * 线程拓展
 *
 * @author LENOVO
 * @since 2025/4/23 9:35
 */
public class Extend {
    public static void main(String[] args) {

        Runnable target = new MyRunable();

        for (int i = 1; i <= 100 ; i++) {
            new Thread(target).start();
        }

    }
}
