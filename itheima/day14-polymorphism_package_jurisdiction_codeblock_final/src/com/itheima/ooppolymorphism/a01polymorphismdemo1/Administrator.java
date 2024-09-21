package com.itheima.ooppolymorphism.a01polymorphismdemo1;

/**
 * @author libing
 */
public class Administrator extends Person {
    @Override
    public void show() {
        System.out.println("管理员的信息为：" + getName() + ", " + getAge());
    }
}
