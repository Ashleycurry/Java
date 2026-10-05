package com.myproject.OOP_Demo_01;

public class demo_01 {
    public static void main(String[] args) {
        // 案例：类和对象——创建对象、使用对象
        System.out.println("=== 案例：类和对象 ===");

        // 1. 创建对象：类名 对象名 = new 类名();
        //    Phone 类是"设计图"，p 是按图纸造出来的"实物"（对象）
        Phone p = new Phone();

        // 2. 给对象的属性赋值：对象名.属性名
        p.brand = "华为";
        p.price = 5999.9;

        // 3. 访问对象的属性
        System.out.println("品牌：" + p.brand);
        System.out.println("价格：" + p.price);

        // 4. 调用对象的方法：对象名.方法名()
        p.call();
        p.playGame();
    }
}

// 手机类：类 = 属性（有什么）+ 方法（能做什么）
class Phone {
    // 属性
    String brand;   // 品牌
    double price;   // 价格

    // 方法
    public void call() {
        System.out.println("手机正在打电话...");
    }

    public void playGame() {
        System.out.println("手机正在玩游戏...");
    }
}
