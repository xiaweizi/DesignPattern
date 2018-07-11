package com.xiaweizi.design.p12_proxy.staticproxy;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p12_proxy.staticproxy.ProxySubject
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

class ProxySubject implements Subject {
    private Subject subject;

    ProxySubject() {
        subject = new RealSubject();
    }

    @Override
    public void visit() {
        System.out.println("proxy start");
        subject.visit();
        System.out.println("proxy end");
    }

}
