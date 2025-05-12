package com.proxy;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * 明星实现类
 *
 * @author LENOVO
 * @since 2025/5/12 17:26
 */
@Slf4j
@AllArgsConstructor
public class BigStar implements Star{

    private String name;

    @Override
    public String sing(String songName) {
        log.info("{}正在唱{}", this.name, songName);
        return "谢谢!";
    }

    @Override
    public void dance() {
        log.info("{}正在优美的跳舞", this.name);
    }
}
