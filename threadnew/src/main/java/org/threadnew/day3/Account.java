package org.threadnew.day3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 账户类
 *
 * @author LENOVO
 * @since 2025/4/17 17:28
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Account {

    private static final Logger log = LoggerFactory.getLogger(Account.class);
    private String cardId;

    private double money;

    public void drawMoney(double money){
        String name = Thread.currentThread().getName();

        synchronized (this) {
            if (this.money >= money){
                log.info("{}来取钱{}成功", name, money);
                this.money -= money;
                log.info("{}来取钱后，余额剩余{}", name, this.money);
            } else {
                log.info("{}来取钱，余额不足", name);
            }
        }
    }

}
