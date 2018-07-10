package com.xiaweizi.design.p01_singleton.disrupt;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p01_singleton.disrupt.SingletonLazy
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/10
 *     desc   :
 * </pre>
 */

public class SingletonLazy {
    private volatile static SingletonLazy mInstance;

    private SingletonLazy()  {}

    /**
     * 线程不安全
     */
    @Deprecated
    public static SingletonLazy getInstance1() {
        if (null == mInstance) {
            mInstance = new SingletonLazy();
        }
        return mInstance;
    }

    /**
     * 线程安全 synchronized 但是每次调用该方法都需要枷锁，实际情况只需要在没有实例化对象的时候加锁才是有效的
     * 所以这样加锁会影响效率
     */
    public static synchronized SingletonLazy getInstance2() {
        if (null == mInstance) {
            mInstance = new SingletonLazy();
        }
        return mInstance;
    }

    /**
     * 锁向下移，这样只有在对象为空的时候才会加锁
     */
    public static SingletonLazy getInstance3() {
        if (null == mInstance) {
            synchronized (SingletonLazy.class) {
                if (null == mInstance) {
                    mInstance = new SingletonLazy();
                }
            }
        }
        return mInstance;
    }
}
