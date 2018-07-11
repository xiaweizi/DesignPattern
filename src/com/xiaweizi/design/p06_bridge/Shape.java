package com.xiaweizi.design.p06_bridge;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p06_bridge.Shape
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

abstract class Shape {

    Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    abstract void draw();
}
