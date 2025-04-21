package org.threadnew.day6;

import org.threadnew.day5.Account;
import org.threadnew.day5.DrawThread;

/**
 * 线程安全测试类
 *
 * @author LENOVO
 * @since 2025/4/17 17:30
 */
public class ThreadTest {
    public static void main(String[] args) {

        Desk desk = new Desk();

        try {
            new Thread(() -> {
                while (true) {
                    desk.put();
                }
            }, "厨师1").start();

            new Thread(() -> {
                while (true) {
                    desk.put();
                }
            }, "厨师2").start();

            new Thread(() -> {
                while (true) {
                    desk.put();
                }
            }, "厨师3").start();

            new Thread(() -> {
                while (true) {
                    desk.get();
                }
            }, "吃货1").start();

            new Thread(() -> {
                while (true) {
                    desk.get();
                }
            }, "吃货2").start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
        }

    }
}
