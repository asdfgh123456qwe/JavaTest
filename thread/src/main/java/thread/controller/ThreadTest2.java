package thread.controller;

import thread.pojo.Desk;

/**
 * 线程通信
 *
 * @author LENOVO
 * @since 2024/7/22 9:22
 */
public class ThreadTest2 {
    public static void main(String[] args) {

        // 创建一个处理对象
        Desk desk = new Desk();

        // 创建三个生产者线程
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

        // 创建两个消费者线程
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
    }
}
