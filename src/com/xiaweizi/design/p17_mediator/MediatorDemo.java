package com.xiaweizi.design.p17_mediator;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p17_mediator.MediatorDemo
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/12
 *     desc   :
 * </pre>
 */

class MediatorDemo {
    public static void main(String[] args) {
        MediatorStructure mediatorStructure = new MediatorStructure();
        HouseOwner houseOwner = new HouseOwner("包租婆", mediatorStructure);
        Tenant tenant = new Tenant("酱爆", mediatorStructure);
        mediatorStructure.setHouseOwner(houseOwner);
        mediatorStructure.setTenant(tenant);
        tenant.constact("怎么没水了");
        houseOwner.constact("你没交水费");
    }
}
