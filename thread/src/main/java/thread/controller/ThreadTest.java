package thread.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import thread.service.ThreadService;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 线程测试类
 *
 * @author LENOVO
 * @since 2024/7/11 15:48
 */
@RestController
@RequestMapping("/thread")
public class ThreadTest {
    
    @Autowired
    private ThreadService threadService;

    @GetMapping("/first")
    public void getThread(){
        threadService.run();
    }

    public static void main(String[] args) throws Exception {
        // 创建任务类的对象
    /*    Runnable target = new MyRunable();
        new Thread(target).start();*/

//        new Thread(() -> {
//            for (int i = 1; i < 5; i++) {
//                System.out.println("线程输出========>" + i);
//            }
//        }).start();
//
//        for (int i = 1; i < 5; i++) {
//            System.out.println("主线程输出=======>" + i);
//        }

        // /创建一个Callable对象
        Callable<String> call = new MyCallable(100);

        // 把Callable对象封装成FutureTask对象
        FutureTask<String> task = new FutureTask<>(call);

        new Thread(task).start();

        String rs = task.get();
        
        System.out.println(rs);
    }
}
