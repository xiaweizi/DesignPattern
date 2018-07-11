package com.xiaweizi.design.p05_adapter.interfaceadapter;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p05_adapter.interfaceadapter.AbsAction
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

abstract class AbsAction implements IAction{
    @Override
    public void A() {
        System.out.println("A");
    }

    @Override
    public void B() {
        System.out.println("B");
    }

    @Override
    public void C() {
        System.out.println("C");
    }

    @Override
    public void D() {
        System.out.println("D");
    }

    @Override
    public void E() {
        System.out.println("E");
    }
}
