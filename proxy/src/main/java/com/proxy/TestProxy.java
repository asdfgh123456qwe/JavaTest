package com.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * 代理测试类
 *
 * @author LENOVO
 * @since 2025/5/12 17:45
 */
@Slf4j
public class TestProxy {

    public static void main(String[] args) {

        BigStar star = new BigStar("杨超越");

        Star proxy = ProxyUtil.createProxy(star);

        log.info(proxy.sing("卡路里"));

        proxy.dance();
    }

}
