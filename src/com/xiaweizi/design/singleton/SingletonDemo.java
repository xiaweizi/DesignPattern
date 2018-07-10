package com.xiaweizi.design.singleton;

import com.xiaweizi.design.singleton.disrupt.SingletonLazy;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.singleton.SingletonDemo
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/10
 *     desc   :
 * </pre>
 */

class SingletonDemo {

    public static void main(String[] args) {
        lazyPattern();
    }

    private static void lazyPattern() {
        SingletonLazy singletonLazy1 = SingletonLazy.getInstance1();
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance1();
        System.err.println("懒汉模式，线程不安全：" + (singletonLazy1 == singletonLazy2));

        SingletonLazy singletonLazy3 = SingletonLazy.getInstance2();
        SingletonLazy singletonLazy4 = SingletonLazy.getInstance3();
        System.out.println("懒汉模式，线程安全：" + (singletonLazy3 == singletonLazy4));
    }
}
