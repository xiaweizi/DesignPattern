package com.xiaweizi.design.p04_prototype;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p04_prototype.PrototypeDemo
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/10
 *     desc   :
 * </pre>
 */

class PrototypeDemo {
    public static void main(String[] args) {
//        usePrototype1();
        usePrototype2();
    }

    private static void usePrototype1() {
        Programmer programmer1 = new Programmer();
        programmer1.setName("programmer1");
        try {
            Programmer programmer2 = programmer1.clone();
            System.out.println(programmer2.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    private static void usePrototype2() {
        // 可以实现深度拷贝
        Address address = new Address();
        address.setName("address-name");
        address.setPhone("address-phone");
        Student student1 = new Student();
        student1.setName("student-name");
        student1.setAddress(address);
        try {
            Student student2 = (Student) student1.clone();
            System.out.println(student2.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
