package com.itheima.this_super;

public class Demo1 {
    /*
        super的调用细节:
            super.父类成员变量
            super.父类成员方法();

            如果调用的成员, 在子类中不存在, super.可以省略不写.
     */
    public static void main(String[] args) {
        Zi z = new Zi();
        z.method();
    }
}

class Fu {
    int num = 10;

    public void show() {
        System.out.println("Fu...show...");
    }
}

class Zi extends Fu {

    public Zi() {
        this(10);
    }

    public Zi(int num) {
        super();
    }

    public void method() {
        System.out.println(num);
        show();
    }
}