package com.itheima.oopabstract.a01abstractdemo1;

/**
 * @author libing
 */
public class Test {
    public static void main(String[] args) {
        //创建对象
        //Person p = new Person();


        Student s = new Student("zhangsan", 23);

        System.out.println(s.getName() + ", " + s.getAge());
    }
}
