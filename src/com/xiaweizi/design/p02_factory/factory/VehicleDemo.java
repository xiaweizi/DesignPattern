package com.xiaweizi.design.p02_factory.factory;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p02_factory.factory.VehicleDemo
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/10
 *     desc   :
 * </pre>
 */

class VehicleDemo {
    public static void main(String[] args) {
        IFly iFly1 = new FlyFactory().createVehicle(FlyOne.class);
        iFly1.fly();
        IFly iFly2 = new FlyFactory().createVehicle(FlyTwo.class);
        iFly2.fly();

        IRun iRun1 = new RunFactory().createVehicle(RunOne.class);
        iRun1.run();
        IRun iRun2 = new RunFactory().createVehicle(RunTwo.class);
        iRun2.run();
    }
}
