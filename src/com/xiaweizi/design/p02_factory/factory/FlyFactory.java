package com.xiaweizi.design.p02_factory.factory;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p02_factory.factory.FlyFactory
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/10
 *     desc   :
 * </pre>
 */

class FlyFactory implements VehicleFactory<IFly> {

    IFly iFly = null;

    @Override
    public IFly createVehicle(Class<?> clazz) {
        try {
            iFly = (IFly) clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return iFly;
    }
}
