package com.itheima.constructor;

public class Test {
    /*
        在子类所有的构造方法中, 第一句话默认隐藏了 super(); 访问父类的空参数构造方法
        从而完成父类的初始化操作.
     */
    public static void main(String[] args) {
        Zi z1 = new Zi();
        Zi z2 = new Zi(10);
    }
}

class Fu {
    public Fu() {
        System.out.println("Fu类空参数构造方法");
    }

    public Fu(int num) {
        System.out.println("Fu类带参数构造方法...");
    }
}

class Zi extends Fu {
    public Zi() {
        //super();
        System.out.println("Zi类空参数构造方法");
    }

    public Zi(int num) {
        //super();
        System.out.println("Zi类带参数构造方法...");
    }
}

