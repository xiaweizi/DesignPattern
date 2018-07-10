package com.xiaweizi.design.p04_prototype;

import java.io.Serializable;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p04_prototype.Programmer
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/10
 *     desc   :
 * </pre>
 */

class Programmer implements Serializable, Cloneable {

    private static final long serialVersionUID = 5531291315637621866L;
    private String name;

    @Override
    protected Programmer clone() throws CloneNotSupportedException {
        return (Programmer) super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
