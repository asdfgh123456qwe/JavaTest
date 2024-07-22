package thread.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * 桌子
 *
 * @author LENOVO
 * @since 2024/7/22 10:43
 */
public class Desk {
    List<String> list = new ArrayList<>();

    public synchronized void put() {
        try {
            String name = Thread.currentThread().getName();
            // 判断是否有包子
            if (list.size() == 0) {
                list.add(name + "做的包子");
                System.out.println(name + "做了一个包子");
                Thread.sleep(2000);

                // 唤醒所有线程
                this.notifyAll();

                // 当前占锁线程等待
                this.wait();
            } else {
                this.notifyAll();
                this.wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public synchronized void get() {
        try {
            String name = Thread.currentThread().getName();
            if (list.size() != 1){
                System.out.println(name + "吃了：" + list.get(0));
                list.clear();
                Thread.sleep(1000);
                this.notifyAll();
                this.wait();
            } else {
                // 没有包子
                this.notifyAll();
                this.wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
