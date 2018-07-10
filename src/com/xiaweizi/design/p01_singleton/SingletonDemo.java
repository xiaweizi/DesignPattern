package com.xiaweizi.design.p01_singleton;

import com.xiaweizi.design.p01_singleton.disrupt.SingletonLazy;
import com.xiaweizi.design.p01_singleton.disrupt.SingletonStarve;
import com.xiaweizi.design.p01_singleton.disrupt.SingletonStarveSer;
import com.xiaweizi.design.p01_singleton.emum.SingletonEnum;
import com.xiaweizi.design.p01_singleton.undisrupted.SingletonUnDisrupted;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p01_singleton.SingletonDemo
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
//        useReflectDestroySingleton2();
        userSerialDestroySingleton();
//        useReflectUnDestroySingleton1();
//        useReflectUnDestroySingleton2();
        useSerialUnDestroySingleton();
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
        try {
            Class<SingletonEnum> singletonLazyClass = SingletonEnum.class;
            Constructor<SingletonEnum> declaredConstructor = singletonLazyClass.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            SingletonEnum singletonLazy1 = declaredConstructor.newInstance();
            SingletonEnum singletonLazy2 = declaredConstructor.newInstance();
            System.out.println("使用反射破坏单例：" + (singletonLazy1 == singletonLazy2));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private static void userSerialDestroySingleton() {
        SingletonStarveSer singletonStarve1 = SingletonStarveSer.getInstance();
        wroteObj(singletonStarve1);
        SingletonStarveSer singletonStarve2 = (SingletonStarveSer) readObj(singletonStarve1);
        System.out.println("使用序列化破坏单例：" + (singletonStarve1 == singletonStarve2));
    }

    private static void useReflectUnDestroySingleton1() {
        try {
            Class<SingletonUnDisrupted> singletonUnDisruptedClass = SingletonUnDisrupted.class;
            Constructor<SingletonUnDisrupted> declaredConstructor = singletonUnDisruptedClass.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            SingletonUnDisrupted singletonUnDisrupted1 = declaredConstructor.newInstance();
            SingletonUnDisrupted singletonUnDisrupted2 = declaredConstructor.newInstance();
            System.out.println(singletonUnDisrupted1 == singletonUnDisrupted2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void useReflectUnDestroySingleton2() {
        try {
            SingletonUnDisrupted singletonUnDisrupted1 = SingletonUnDisrupted.getInstance();
            Class<SingletonUnDisrupted> singletonUnDisruptedClass = SingletonUnDisrupted.class;
            Constructor<SingletonUnDisrupted> declaredConstructor = singletonUnDisruptedClass.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            SingletonUnDisrupted singletonUnDisrupted2 = declaredConstructor.newInstance();
            System.out.println(singletonUnDisrupted1 == singletonUnDisrupted2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void useSerialUnDestroySingleton() {
        SingletonUnDisrupted singletonUnDisrupted1 = SingletonUnDisrupted.getInstance();
        wroteObj(singletonUnDisrupted1);
        SingletonUnDisrupted singletonUnDisrupted2 = (SingletonUnDisrupted) readObj(singletonUnDisrupted1);
        System.out.println(singletonUnDisrupted1 == singletonUnDisrupted2);
    }

    private static void wroteObj(Object object) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(object.getClass().getSimpleName() + ".obj");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(object);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
                oos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static Object readObj(Object object1) {
        Object object = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(object1.getClass().getSimpleName() + ".obj");
            ois = new ObjectInputStream(fis);
            object = ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                ois.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return object;
    }

}
