package com.itheima.oopextends.a08oopextendsdemo8;

/**
 * @author libing
 */
public class Person {
    String name;
    int age;

    public Person() {
        System.out.println("父类的无参构造");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}