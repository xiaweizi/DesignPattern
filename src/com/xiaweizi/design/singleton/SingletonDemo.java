package com.xiaweizi.design.singleton;

import com.xiaweizi.design.singleton.disrupt.SingletonLazy;
import com.xiaweizi.design.singleton.disrupt.SingletonStarve;
import com.xiaweizi.design.singleton.emum.SingletonEnum;

import java.lang.reflect.Constructor;

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
//        enumPattern();
//        useReflectDestroySingleton1();
        useReflectDestroySingleton2();
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

    private static void useReflectDestroySingleton1() {
        try {
            Class<SingletonLazy> singletonLazyClass = SingletonLazy.class;
            Constructor<?>[] declaredConstructors = singletonLazyClass.getDeclaredConstructors();
            for (Constructor<?> declaredConstructor : declaredConstructors) {
                if (0 == declaredConstructor.getParameterCount() && singletonLazyClass.getName().equals(declaredConstructor.getName())) {
                    declaredConstructor.setAccessible(true);
                    SingletonLazy singletonLazy1 = (SingletonLazy) declaredConstructor.newInstance();
                    SingletonLazy singletonLazy2 = (SingletonLazy) declaredConstructor.newInstance();
                    System.out.println("使用反射破坏单例:" + (singletonLazy1 == singletonLazy2));
                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private static void useReflectDestroySingleton2() {
        try{
            Class<SingletonEnum> singletonLazyClass = SingletonEnum.class;
            Constructor<SingletonEnum> declaredConstructor = singletonLazyClass.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            SingletonEnum singletonLazy1 = declaredConstructor.newInstance();
            SingletonEnum singletonLazy2 = declaredConstructor.newInstance();
            System.out.println("使用反射破坏单例：" + (singletonLazy1 == singletonLazy2));
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

}
