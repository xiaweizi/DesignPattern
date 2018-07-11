package com.xiaweizi.design.p12_proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p12_proxy.dynamicproxy.ProxyHandler
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

class ProxyHandler implements InvocationHandler {
    private Subject subject;

    ProxyHandler(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始代理");
        System.out.println(proxy.getClass().getSimpleName());
        System.out.println(method.getName());
        return method.invoke(subject, args);
    }
}
