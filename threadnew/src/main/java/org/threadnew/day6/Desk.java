package org.threadnew.day6;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 桌子类，资源
 *
 * @author LENOVO
 * @since 2025/4/21 9:39
 */
@Slf4j
public class Desk {

    List<String> list = new ArrayList();

    public synchronized void put(){
        try {
            String name = Thread.currentThread().getName();
            if (list.size() == 0){
                list.add(name + "做的包子");
                log.info("{}做的包子", name);
                Thread.sleep(2000);
                this.notifyAll();
                this.wait();
            } else {
                this.notifyAll();
                this.wait();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void get() {
        try {
            String name = Thread.currentThread().getName();
            if (list.size() == 1){
                log.info("{}吃了{}", name, list.get(0));
                list.clear();
                this.notifyAll();
                this.wait();
            } else {
                this.notifyAll();
                this.wait();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
