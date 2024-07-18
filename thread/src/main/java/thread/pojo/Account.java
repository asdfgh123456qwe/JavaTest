package thread.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 银行账户类
 *
 * @author LENOVO
 * @since 2024/7/17 9:13
 */
/*@NoArgsConstructor
@AllArgsConstructor*/
@Data
public class Account {
    private String cardId;
    private Double money;
    private final Lock lock = new ReentrantLock();

    public Account() {
    }

    public Account(String cardId, Double money) {
        this.cardId = cardId;
        this.money = money;
    }

    //    public static void test() {
//        synchronized (Account.class) {
//            System.out.println("静态方法调用");
//        }
//    }

//    public void drawMoney(Double money) {
//        synchronized (this) {
//            if (this.money >= money) {
//                System.out.println("取钱成功");
//                this.money -= money;
//                System.out.println("余额为：" + this.money);
//            } else {
//                System.out.println("余额不足");
//            }
//        }
//    }

//    public synchronized void drawMoney(Double money) {
//        if (this.money >= money) {
//            System.out.println("取钱成功");
//            this.money -= money;
//            System.out.println("余额为：" + this.money);
//        } else {
//            System.out.println("余额不足");
//        }
//    }

    public void drawMoney(Double money) {

        try {
            lock.lock();
            if (this.money >= money) {
                System.out.println("取钱成功");
                this.money -= money;
                System.out.println("余额为：" + this.money);
            } else {
                System.out.println("余额不足");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }

    }
}
