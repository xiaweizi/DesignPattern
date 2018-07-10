package com.xiaweizi.design.p03_builder;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p03_builder.Student
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/10
 *     desc   :
 * </pre>
 */

class Student {
    private String name;
    private int age;
    private String sex;

    private Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.sex = builder.sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    static class Builder {
        private String name;
        private int age;
        private String sex;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        Student build() {
            return new Student(this);
        }
    }

}
