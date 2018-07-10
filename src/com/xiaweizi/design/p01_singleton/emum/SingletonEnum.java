package com.xiaweizi.design.p01_singleton.emum;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p01_singleton.emum.SingletonEnum
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/10
 *     desc   :
 * </pre>
 */

public enum  SingletonEnum {
    INSTANCE;

    private String name;
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
