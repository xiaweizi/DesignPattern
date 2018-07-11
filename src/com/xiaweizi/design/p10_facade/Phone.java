package com.xiaweizi.design.p10_facade;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p10_facade.Phone
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

interface Phone {
    void call();
    void hangUp();
}

class PhoneImp implements Phone{

    @Override
    public void call() {
        System.out.println("打电话");
    }

    @Override
    public void hangUp() {
        System.out.println("挂电话");
    }
}
