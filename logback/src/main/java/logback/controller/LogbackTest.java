package logback.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 日志练习
 *
 * @author LENOVO
 * @since 2024/7/8 15:18
 */
public class LogbackTest {
    public static final Logger LOGGER = LoggerFactory.getLogger("LoggerTest");
    public static void main(String[] args) {
        try {
            LOGGER.info("chu法方法开始执行");
            chu(10, 0);
            LOGGER.info("chu法执行成功");
        } catch (Exception e) {
            LOGGER.error("出现bug");
            throw new RuntimeException(e);
        }
    }

    public static void chu(int a, int b){
        LOGGER.debug("a：" + a);
        LOGGER.debug("b：" + b);
        int c = a / b;
        LOGGER.info("结果是：" + c);
    }
}
