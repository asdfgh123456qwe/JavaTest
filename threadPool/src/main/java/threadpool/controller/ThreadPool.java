package threadpool.controller;

import org.apache.tomcat.util.threads.ThreadPoolExecutor;
import threadpool.service.MyRunable;

import java.util.concurrent.*;

/**
 * 线程池
 *
 * @author LENOVO
 * @since 2024/7/22 16:49
 */
public class ThreadPool {
    public static void main(String[] args) {

        ExecutorService pool = new ThreadPoolExecutor(3,
                5,
                8,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(4),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy());
        Runnable target = new MyRunable();
        pool.execute(target);   // 线程池会自动创建一个新线程，自动处理这个任务，自动执行的
        pool.execute(target);   // 线程池会自动创建一个新线程，自动处理这个任务，自动执行的
        pool.execute(target);   // 线程池会自动创建一个新线程，自动处理这个任务，自动执行的
        pool.execute(target);   // 复用前面的核心线程
        pool.execute(target);   // 复用前面的核心线程
        pool.execute(target);   // 复用前面的核心线程
        pool.execute(target);   // 复用前面的核心线程

        // 到了临时线程的创建时机了
        pool.execute(target);   // 使用临时线程
        pool.execute(target);   // 使用临时线程

        // 到了新任务的拒绝时机了
        pool.execute(target);

//        pool.shutdown();   // 等线程池的任务都执行完再关闭线程池
//        pool.shutdownNow();    // 立即关闭线程池，不管任务是否执行完毕
    }
}
