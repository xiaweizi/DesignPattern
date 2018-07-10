package com.xiaweizi.design.p02_factory.factory;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p02_factory.factory.RunFactory
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/10
 *     desc   :
 * </pre>
 */

class RunFactory implements VehicleFactory<IRun> {

    IRun iRun;

    @Override
    public IRun createVehicle(Class<?> clazz) {
        try {
            iRun = (IRun) clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return iRun;
    }
}
