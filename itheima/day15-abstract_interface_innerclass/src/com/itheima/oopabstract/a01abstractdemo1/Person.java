package com.itheima.oopabstract.a01abstractdemo1;

/**
 * @author libing
 */
public abstract class Person {

    private String name;
    private int age;

    /**
     * 作用：当创建子类对象的时，给属性进行赋值的。
     */
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * work
     */
    public abstract void work();

    public void sleep() {
        System.out.println("睡觉");
    }

}
