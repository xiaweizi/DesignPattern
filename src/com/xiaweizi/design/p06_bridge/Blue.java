package com.xiaweizi.design.p06_bridge;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p06_bridge.Blue
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

class Blue implements Color {

    @Override
    public void addColor(String shape) {
        System.out.println("给" + shape + "添加蓝色");
    }
}
