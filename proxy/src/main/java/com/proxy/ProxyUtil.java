package com.proxy;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * 代理工具类
 *
 * @author LENOVO
 * @since 2025/5/9 14:22
 */
@Slf4j
public class ProxyUtil {

    public static Star createProxy(BigStar bigStar){
        Star starProxy = (Star) Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(),
                new Class[]{Star.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if ("sing".equals(method.getName())) {
                            log.info("准备话筒，收钱20w");
                        } else if ("dance".equals(method.getName())) {
                            log.info("准备舞台，收钱1000w");
                        }
                        return method.invoke(bigStar, args);
                    }
                });
        return starProxy;
    }

}
