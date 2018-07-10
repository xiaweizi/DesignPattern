package com.xiaweizi.design.p02_factory.simplefactory;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p02_factory.simplefactory.Car
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/10
 *     desc   :
 * </pre>
 */

class Car implements Vehicle{
    @Override
    public void run() {
        System.out.println("car run");
    }
}
