package com.xiaweizi.design.p02_factory.simplefactory;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p02_factory.simplefactory.VehicleFactory
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/10
 *     desc   :
 * </pre>
 */

class VehicleFactory {
    public static Vehicle createVehicle(String type) {
        Vehicle vehicle = null;
        if (type.equalsIgnoreCase("bus")) {
            vehicle = new Bus();
        } else if (type.equalsIgnoreCase("car")) {
            vehicle = new Car();
        } else if (type.equalsIgnoreCase("train")) {
            vehicle = new Train();
        }
        return vehicle;
    }
}
