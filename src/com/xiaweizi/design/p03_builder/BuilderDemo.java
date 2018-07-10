package com.xiaweizi.design.p03_builder;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p03_builder.BuilderDemo
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/10
 *     desc   :
 * </pre>
 */

class BuilderDemo {
    public static void main(String[] args) {
        Student student = new Student.Builder().setAge(12).setName("name").setSex("man").build();
        System.out.println(student.toString());
    }
}
