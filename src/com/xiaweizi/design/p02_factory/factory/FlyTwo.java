package com.xiaweizi.design.p02_factory.factory;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p02_factory.factory.FlyTwo
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/10
 *     desc   :
 * </pre>
 */

class FlyTwo implements IFly {
    @Override
    public void fly() {
        System.out.println("fly two");
    }
}
