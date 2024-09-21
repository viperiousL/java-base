package com.itheima.oopinterface.a05interfacedemo5;

/**
 * @author libing
 */
public abstract class Coach extends Person {

    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    /**
     * 教
     */
    public abstract void teach();
}
