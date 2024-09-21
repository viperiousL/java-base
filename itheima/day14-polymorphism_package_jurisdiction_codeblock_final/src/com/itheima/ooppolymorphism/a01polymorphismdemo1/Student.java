package com.itheima.ooppolymorphism.a01polymorphismdemo1;

/**
 * @author libing
 */
public class Student extends Person {

    @Override
    public void show() {
        System.out.println("学生的信息为：" + getName() + ", " + getAge());
    }
}
