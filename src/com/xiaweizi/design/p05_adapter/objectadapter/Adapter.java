package com.xiaweizi.design.p05_adapter.objectadapter;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p05_adapter.objectadapter.Adapter
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/10
 *     desc   :
 * </pre>
 */

class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void convertToTarget() {
        adaptee.adapteeAction();
        System.out.println("被转换成了 target");
    }
}
