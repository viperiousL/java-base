package com.itheima.oopabstract.a02abstractdemo2;

/**
 * @author libing
 */
public class Frog extends Animal {


    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙在吃虫子");
    }
}
