package com.xiaweizi.design.singleton.disrupt;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.singleton.disrupt.SingletonStarve
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/10
 *     desc   :
 * </pre>
 */

public class SingletonStarve {
    private volatile static SingletonStarve mInstance = new SingletonStarve();
    private SingletonStarve() {

    }

    public static SingletonStarve getInstance() {
        return mInstance;
    }
}
