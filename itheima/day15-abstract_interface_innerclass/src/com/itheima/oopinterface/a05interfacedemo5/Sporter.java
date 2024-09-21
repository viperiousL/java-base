package com.itheima.oopinterface.a05interfacedemo5;

/**
 * @author libing
 */
public abstract class Sporter extends Person {

    public Sporter() {
    }

    public Sporter(String name, int age) {
        super(name, age);
    }

    /**
     * study
     */
    public abstract void study();
}
