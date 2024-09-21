package com.itheima.oopextends.a10oopextendsdemo10;

/**
 * @author libing
 */
public class Manager extends Employee {

    private double bouns;

    /**
     * 空参构造
     */
    public Manager() {
    }

    /**
     * 带全部参数的构造
     * 父类 + 子类
     *
     * @param id     id
     * @param name   name
     * @param salary salary
     * @param bouns  bouns
     */
    public Manager(String id, String name, double salary, double bouns) {
        super(id, name, salary);
        this.bouns = bouns;
    }


    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    @Override
    public void work() {
        System.out.println("管理其他人");
    }
}