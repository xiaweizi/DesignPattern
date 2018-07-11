package com.xiaweizi.design.p11_flyweight;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p11_flyweight.Circle
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

class Circle implements Shape {
    private String color;
    private int x;
    private int y;

    public void setColor(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
