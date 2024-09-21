package com.itheima.oopextends.a04oopextendsdemo4;

/**
 * @author libing
 */
public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.ziShow();
    }
}

class Ye {
    String name = "Ye";
}

class Fu extends Ye{
    String name = "Fu";
}

class Zi extends Fu{
    String name = "Zi";
    public void ziShow(){
        String name = "ziShow";
        //ziShow
        System.out.println(name);
        //Zi
        System.out.println(this.name);
        //Fu
        System.out.println(super.name);
    }
}
