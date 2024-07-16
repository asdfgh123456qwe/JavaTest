package thread.controller;

/**
 * 任务类
 * 1·定义一个任务类，实现Runable接口
 *
 * @author LENOVO
 * @since 2024/7/12 10:50
 */
public class MyRunable implements Runnable{

    // 2.重写Runable的run()方法
    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println("子线程的输出========>" + i);
        }
    }
}
