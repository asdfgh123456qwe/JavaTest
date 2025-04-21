package org.threadnew.day5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cglib.core.Block;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 账户类
 *
 * @author LENOVO
 * @since 2025/4/17 17:28
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Slf4j
public class Account {

    private String cardId;

    private double money;

    private final Lock lk = new ReentrantLock();

    public void drawMoney(double money){

        String name = Thread.currentThread().getName();

        try {
            lk.lock();
            if (this.money >= money){
                log.info("{}来取钱{}成功", name, money);
                this.money -= money;
                log.info("{}来取钱后，余额剩余{}", name, this.money);
            } else {
                log.info("{}来取钱，余额不足", name);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            lk.unlock();
        }

    }

}
