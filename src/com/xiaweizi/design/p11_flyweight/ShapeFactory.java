package com.xiaweizi.design.p11_flyweight;

import java.util.HashMap;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p11_flyweight.ShapeFactory
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null) {
            circle = new Circle();
            circleMap.put(color, circle);
            System.out.println("create circle of color:" + color);
        }
        return circle;
    }
}
