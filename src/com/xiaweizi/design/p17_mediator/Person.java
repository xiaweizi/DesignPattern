package com.xiaweizi.design.p17_mediator;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p17_mediator.Person
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/12
 *     desc   :
 * </pre>
 */

class Person {
    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
