package com.itheima.oopextends.a10oopextendsdemo10;

/**
 * @author libing
 */
public class Cook extends Employee{

    public Cook() {
    }

    public Cook(String id, String name, double salary) {
        super(id, name, salary);
    }


    @Override
    public void work() {
        System.out.println("厨师正在炒菜");
    }
}
