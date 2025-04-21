package org.threadnew.day5;

/**
 * 线程安全测试类
 *
 * @author LENOVO
 * @since 2025/4/17 17:30
 */
public class ThreadTest {
    public static void main(String[] args) {

        Account acc = new Account("ICBC-110", 100000);

        new DrawThread(acc, "小明").start();

        new DrawThread(acc, "小红").start();

    }
}
