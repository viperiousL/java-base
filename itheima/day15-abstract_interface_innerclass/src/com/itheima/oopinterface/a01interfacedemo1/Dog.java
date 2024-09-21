package com.itheima.oopinterface.a01interfacedemo1;

/**
 * @author libing
 */
public class Dog extends Animal implements Swim {

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗刨");
    }
}
