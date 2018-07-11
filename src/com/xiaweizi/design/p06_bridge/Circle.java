package com.xiaweizi.design.p06_bridge;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p06_bridge.Circle
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

class Circle extends Shape {
    @Override
    void draw() {
        color.addColor("圆形");
    }
}
