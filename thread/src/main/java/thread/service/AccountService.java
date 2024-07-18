package thread.service;

import org.springframework.stereotype.Service;
import thread.pojo.Account;

import java.util.concurrent.Callable;

/**
 * 银行账户取钱线程
 *
 * @author LENOVO
 * @since 2024/7/17 9:58
 */
public class AccountService extends Thread{

    private Account account;

    public AccountService(Account acc){
        this.account = acc;
    }

    @Override
    public void run() {
        // 取钱
        account.drawMoney(100000.0);
    }
}
