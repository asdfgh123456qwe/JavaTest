package com.test.threadtest.target;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 线程1练习任务类
 *
 * @author LENOVO
 * @since 2025/4/24 8:54
 */
@Slf4j
public class Test1Runnable implements Runnable {

    private AtomicInteger count = new AtomicInteger(100);

    private int hongCount = 0;

    private int mingCount = 0;

    @Override
    public void run() {
        while (true){

            if(count.get() < 10) {
                break;
            }

            if (Thread.currentThread().getName().equals("小红")) {
                hongCount++;
            } else {
                mingCount++;
            }
            log.info("{}发送了一份礼品, 现在还剩{}份礼品", Thread.currentThread().getName(), count.decrementAndGet());
        }

        if (Thread.currentThread().getName().equals("小红")){
            log.info("小红发放了{}份礼物", hongCount);
        } else {
            log.info("小明发放了{}份礼物", mingCount);
        }
    }
}
