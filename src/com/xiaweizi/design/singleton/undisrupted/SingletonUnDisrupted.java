package com.xiaweizi.design.singleton.undisrupted;

import java.io.Serializable;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.singleton.undisrupted.SingletonUnDisrupted
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/10
 *     desc   :
 * </pre>
 */

public class SingletonUnDisrupted implements Serializable{

    private static final long serialVersionUID = -266194913434407036L;

    private static boolean flag = false;

    private static final SingletonUnDisrupted mInstance = new SingletonUnDisrupted();

    private SingletonUnDisrupted() {
        synchronized (SingletonUnDisrupted.class) {
            if (!flag) {
                flag = !flag;
            } else {
                throw new RuntimeException("单例模式防止被侵犯");
            }
        }
    }

    public static SingletonUnDisrupted getInstance() {
        return mInstance;
    }

    private Object readResolve() {
        return mInstance;
    }
}
