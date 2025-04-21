package org.threadnew.day3;

/**
 * 创建线程的类
 *
 * @author LENOVO
 * @since 2025/4/17 17:33
 */
public class DrawThread extends Thread{

    private Account acc;

    public DrawThread(Account acc, String name){
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        acc.drawMoney(100000);
    }
}
