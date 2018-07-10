package com.xiaweizi.design.p05_adapter.classadapter;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p05_adapter.classadapter.Adapter
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/10
 *     desc   :
 * </pre>
 */

class Adapter extends Adaptee implements Target {

    @Override
    public void convertToTarget() {
        originalOperation();
        System.out.println("开始转换成目标");
    }
}
