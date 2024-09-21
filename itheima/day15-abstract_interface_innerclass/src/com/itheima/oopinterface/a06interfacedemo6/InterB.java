package com.itheima.oopinterface.a06interfacedemo6;

/**
 * @author libing
 */
public interface InterB {
    /**
     * show
     */
    public default void show() {
        System.out.println("InterB接口中的默认方法 ---- show");
    }
}
