package com.xiaweizi.design.p10_facade;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p10_facade.SmartPhone
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

class SmartPhone {
    private Phone phone = new PhoneImp();
    private Camera camera = new SonyCamera();
    void showFunction() {
        phone.call();
        phone.hangUp();
        camera.open();
        camera.takePhoto();
    }
}
