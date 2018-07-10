package com.xiaweizi.design.p01_singleton.disrupt;

import java.io.Serializable;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p01_singleton.disrupt.SingletonStarve
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/10
 *     desc   :
 * </pre>
 */

public class SingletonStarveSer implements Serializable{

    private static final long serialVersionUID = -266194913434407036L;

    private volatile static SingletonStarveSer mInstance = new SingletonStarveSer();
    private SingletonStarveSer() {

    }

    public static SingletonStarveSer getInstance() {
        return mInstance;
    }
}
