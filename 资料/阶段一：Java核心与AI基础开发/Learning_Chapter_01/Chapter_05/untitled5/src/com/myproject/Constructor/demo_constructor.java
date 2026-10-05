package com.myproject.Constructor;

public class demo_constructor {
    public static void main(String[] args) {
        // 案例：构造方法——创建对象时自动调用
        System.out.println("=== 案例：构造方法 ===");

        // 1. 用无参构造创建对象，再逐个赋值
        Phone p1 = new Phone();
        p1.brand = "华为";
        p1.price = 5999.9;
        p1.show();

        System.out.println();

        // 2. 用有参构造创建对象，一步完成赋值
        Phone p2 = new Phone("小米", 3999.0);
        p2.show();
    }
}

// 手机类
class Phone {
    String brand;
    double price;

    // 无参构造方法：方法名与类名完全相同，没有返回值类型（连 void 也不写）
    public Phone() {
        System.out.println("调用了无参构造方法");
    }

    // 有参构造方法（构造方法重载）：new 时传入的参数自动赋给成员变量
    public Phone(String brand, double price) {
        System.out.println("调用了有参构造方法");
        this.brand = brand;
        this.price = price;
    }

    public void show() {
        System.out.println("手机品牌：" + brand + "，价格：" + price);
    }
}
