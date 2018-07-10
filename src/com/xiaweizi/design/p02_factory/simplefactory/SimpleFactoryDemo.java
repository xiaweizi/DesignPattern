package com.xiaweizi.design.p02_factory.simplefactory;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p02_factory.simplefactory.SimpleFactoryDemo
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/10
 *     desc   :
 * </pre>
 */

class SimpleFactoryDemo {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.createVehicle("bus");
        vehicle.run();
        vehicle = VehicleFactory.createVehicle("car");
        vehicle.run();
        vehicle = VehicleFactory.createVehicle("car");
        vehicle.run();
    }
}
