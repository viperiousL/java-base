package com.itheima.ooppolymorphism.a01polymorphismdemo1;

/**
 * @author libing
 */
public class Teacher extends Person {

    @Override
    public void show() {
        System.out.println("老师的信息为：" + getName() + ", " + getAge());
    }
}
