package com.xiaweizi.design.p19_observer;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p19_observer.A_Observer
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/12
 *     desc   :
 * </pre>
 */

class A_Observer implements Observer {
    @Override
    public void update(String msg) {
        System.out.println("A update" + msg);
    }
}

class B_Observer implements Observer {
    @Override
    public void update(String msg) {
        System.out.println("B update" + msg);
    }
}

class C_Observer implements Observer {
    @Override
    public void update(String msg) {
        System.out.println("C update" + msg);
    }
}
