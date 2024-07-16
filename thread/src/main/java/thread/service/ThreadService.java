package thread.service;

import org.springframework.stereotype.Service;

/**
 * 线程实现类
 *
 * @author LENOVO
 * @since 2024/7/11 15:49
 */
@Service
public class ThreadService extends Thread{
    @Override
    public void run() {
        System.out.println("子类run");
    }
}
