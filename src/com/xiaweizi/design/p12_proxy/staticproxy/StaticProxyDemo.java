package com.xiaweizi.design.p12_proxy.staticproxy;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p12_proxy.staticproxy.StaticProxyDemo
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

class StaticProxyDemo {
    public static void main(String[] args) {
        Subject subject = new ProxySubject();
        subject.visit();
    }
}
