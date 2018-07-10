package com.xiaweizi.design.p02_factory.simplefactory;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p02_factory.simplefactory.Bus
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/10
 *     desc   :
 * </pre>
 */

class Bus implements Vehicle{
    @Override
    public void run() {
        Vehicle.super.run();
        System.out.println("bus run");
    }

}

