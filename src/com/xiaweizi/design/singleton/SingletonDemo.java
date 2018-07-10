package com.xiaweizi.design.singleton;

import com.xiaweizi.design.singleton.disrupt.SingletonLazy;
import com.xiaweizi.design.singleton.disrupt.SingletonStarve;
import com.xiaweizi.design.singleton.emum.SingletonEnum;

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
//        lazyPattern();
//        starvePattern();
        enumPattern();
    }

    private static void lazyPattern() {
        SingletonLazy singletonLazy1 = SingletonLazy.getInstance1();
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance1();
        System.err.println("懒汉模式，线程不安全：" + (singletonLazy1 == singletonLazy2));

        SingletonLazy singletonLazy3 = SingletonLazy.getInstance2();
        SingletonLazy singletonLazy4 = SingletonLazy.getInstance3();
        System.out.println("懒汉模式，线程安全：" + (singletonLazy3 == singletonLazy4));
    }

    private static void starvePattern() {
        SingletonStarve singletonStarve1 = SingletonStarve.getInstance();
        SingletonStarve singletonStarve2 = SingletonStarve.getInstance();
        System.out.println("恶汉模式：" + (singletonStarve1 == singletonStarve2));
    }

    private static void enumPattern() {
        SingletonEnum singletonEnum1 = SingletonEnum.INSTANCE;
        SingletonEnum singletonEnum2 = SingletonEnum.INSTANCE;
        System.out.println("枚举单例：" + (singletonEnum1 == singletonEnum2));
        singletonEnum1.setName("name");
        System.out.println(singletonEnum2.getName());
    }
}
