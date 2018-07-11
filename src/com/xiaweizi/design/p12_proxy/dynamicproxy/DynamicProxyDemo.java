package com.xiaweizi.design.p12_proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p12_proxy.dynamicproxy.DynamicProxyDemo
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

class DynamicProxyDemo {
    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        Subject subject = (Subject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Subject.class}, new ProxyHandler(realSubject));
        subject.visit();
    }
}
