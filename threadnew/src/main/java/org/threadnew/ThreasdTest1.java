package org.threadnew;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 线程类调动
 *
 * @author LENOVO
 * @since 2025/4/14 17:21
 */
@Slf4j
public class ThreasdTest1 {

    public static void main(String[] args) throws Exception {

        // 创建MyThread线程类表示一个线程
//        Thread myThread = new MyThread();
//
//        // 启动线程
//        myThread.start();

        //     MyRunable target = new MyRunable();

//        new Thread(() -> {
//            for (int i = 0; i < 5; i++) {
//                System.out.println("子线程:" + i);
//            }
//        }).start();

        Callable<String> call = new MyCallable(100);

        FutureTask<String> task = new FutureTask<>(call);

        new Thread(task).start();

        String s = task.get();

        log.info("{}",s);

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程：" + i);
        }
    }

}
