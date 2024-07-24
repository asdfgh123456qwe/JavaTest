package threadpool.service;

/**
 * Runable任务类
 *
 * @author LENOVO
 * @since 2024/7/24 10:26
 */
public class MyRunable implements Runnable{
    @Override
    public void run() {
        // 任务的作用
        System.out.println(Thread.currentThread().getName() + " ===> 输出666~");
        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
