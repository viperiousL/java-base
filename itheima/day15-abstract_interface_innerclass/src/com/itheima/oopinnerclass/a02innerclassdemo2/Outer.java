package com.itheima.oopinnerclass.a02innerclassdemo2;

/**
 * @author libing
 */
public class Outer {
    String name;

    private class Inner {
        static int a = 10;
    }


    public Inner getInstance() {
        return new Inner();
    }


}
