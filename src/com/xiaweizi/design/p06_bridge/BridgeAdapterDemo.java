package com.xiaweizi.design.p06_bridge;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p06_bridge.BridgeAdapterDemo
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

class BridgeAdapterDemo {
    public static void main(String[] args) {
        Shape rect = new Rect();
        Color red = new Red();
        rect.setColor(red);
        rect.draw();

        Shape circle = new Circle();
        Color blue = new Blue();
        circle.setColor(blue);
        circle.setColor(blue);
        circle.draw();
    }
}
