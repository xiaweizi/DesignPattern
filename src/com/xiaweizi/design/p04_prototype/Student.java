package com.xiaweizi.design.p04_prototype;

import java.io.Serializable;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p04_prototype.Student
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/10
 *     desc   :
 * </pre>
 */

class Student implements Serializable, Cloneable{

    private static final long serialVersionUID = 3535832216957858489L;

    private String name;
    private Address address;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
