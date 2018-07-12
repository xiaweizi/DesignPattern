package com.xiaweizi.design.p19_observer;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p19_observer.ObserverDemo
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/12
 *     desc   :
 * </pre>
 */

class ObserverDemo {
    public static void main(String[] args) {
        Observer a = new A_Observer();
        Observer b = new B_Observer();
        Observer c = new C_Observer();
        Observer d = new A_Observer();
        Subject subject =  new A_Subject();
        subject.attach(a);
        subject.attach(a);
        subject.attach(a);
        subject.setMsg("发来了通知");
        subject.notifyAllObserver();

    }
}
