package com.xiaweizi.design.p02_factory.simplefactory;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p02_factory.simplefactory.Vehicle
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/10
 *     desc   :
 * </pre>
 */

public interface Vehicle {
    default void run() {
        System.out.println("--run--");
    }
}
