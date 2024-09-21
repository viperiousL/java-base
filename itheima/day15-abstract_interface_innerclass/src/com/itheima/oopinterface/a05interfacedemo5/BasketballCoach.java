package com.itheima.oopinterface.a05interfacedemo5;

/**
 * @author libing
 */
public class BasketballCoach extends Coach {

    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练正在教如何打篮球");
    }
}
