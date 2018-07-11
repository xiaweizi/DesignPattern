package com.xiaweizi.design.p06_bridge;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p06_bridge.Red
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

class Red implements Color {
    @Override
    public void addColor(String shape) {
        System.out.println("给" + shape + "添加红色");
    }
}
