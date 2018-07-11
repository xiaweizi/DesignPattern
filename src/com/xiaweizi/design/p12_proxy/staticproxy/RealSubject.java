package com.xiaweizi.design.p12_proxy.staticproxy;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p12_proxy.staticproxy.RealSubject
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

class RealSubject implements Subject {
    @Override
    public void visit() {
        System.out.println("this is real subject");
    }
}
