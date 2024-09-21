package com.itheima.oopinterface.aaa;

/**
 * @author libing
 */
public class Test {
    public static void main(String[] args) {
        Inter i = new Inter() {
            @Override
            public void method() {
                System.out.println("aaa");
            }
        };


        i.method();
    }
}
