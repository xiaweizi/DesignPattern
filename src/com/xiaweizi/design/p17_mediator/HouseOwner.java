package com.xiaweizi.design.p17_mediator;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p17_mediator.HouseOwner
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/12
 *     desc   :
 * </pre>
 */

class HouseOwner extends Person {
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }
    void constact(String message) {
        mediator.constact(this, message);
    }
    void getMessage(String message) {
        System.out.println("房主" + name + "，获得消息" + message);
    }
}

class Tenant extends Person {

    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    void constact(String message) {
        mediator.constact(this, message);
    }

    void getMessage(String message) {
        System.out.println("房客" + name + "，获得消息" + message);
    }
}
