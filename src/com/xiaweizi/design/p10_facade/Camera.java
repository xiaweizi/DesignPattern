package com.xiaweizi.design.p10_facade;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p10_facade.Camera
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

interface Camera {
    void open();
    void takePhoto();
}

class SonyCamera implements Camera {

    @Override
    public void open() {
        System.out.println("打开相机");
    }

    @Override
    public void takePhoto() {
        System.out.println("关闭相机");
    }
}