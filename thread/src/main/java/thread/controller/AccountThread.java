package thread.controller;

import org.springframework.web.bind.annotation.RestController;
import thread.pojo.Account;
import thread.service.AccountService;

import java.math.BigDecimal;

/**
 * 银行账户取钱处理类
 *
 * @author LENOVO
 * @since 2024/7/17 9:42
 */
@RestController
public class AccountThread {

    public static void main(String[] args) {

        // 1.创建一个账户对象，代表两个人的共享账户
        Account acc = new Account("ICBC-110", 100000.0);
        // 2.创建两个线程，分别代表小明 小红，再去同一个账户对象中取钱10w
        new AccountService(acc).start(); // 小明
        new AccountService(acc).start(); // 小红

    }
}
