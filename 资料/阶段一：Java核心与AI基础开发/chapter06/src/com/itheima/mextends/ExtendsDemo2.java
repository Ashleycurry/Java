package com.itheima.mextends;

public class ExtendsDemo2 {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
    }
}

class Fu {
    int num = 10;
}

class Zi extends Fu {
    int num = 20;

    public void show() {
        int num = 30;
        System.out.println(num);            // 30
        System.out.println(this.num);       // 20
        System.out.println(super.num);      // 10
    }
}
