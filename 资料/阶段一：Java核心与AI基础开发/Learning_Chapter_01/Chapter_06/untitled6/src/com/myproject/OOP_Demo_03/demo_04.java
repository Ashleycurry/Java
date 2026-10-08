package com.myproject.OOP_Demo_03;

public class demo_04 {
    public static void main(String[] args) {
        // 案例：继承中的成员访问特点——就近原则
        System.out.println("=== 案例1：成员变量的访问特点（就近原则）===");
        Zi zi = new Zi();
        zi.show();

        System.out.println();

        // 案例2：成员方法的访问特点（就近原则 + 重写）
        System.out.println("=== 案例2：成员方法的访问特点 ===");
        // 1. 子类重写了 methodFu，通过子类对象调用的是子类重写后的版本
        zi.methodFu();

        // 2. 子类没有 methodFuOnly，会"就近"去父类中找并调用
        zi.methodFuOnly();

        // 3. 子类自己独有的方法，直接调用
        zi.methodZi();

        System.out.println();

        // 案例3：通过 super 调用父类被重写的原方法
        System.out.println("=== 案例3：super 调用父类的原方法 ===");
        zi.callFuMethod();
    }
}

// 父类
class Fu {
    int num = 10; // 父类成员变量（与子类同名）

    public void methodFu() {
        System.out.println("父类的 methodFu 方法");
    }

    public void methodFuOnly() {
        System.out.println("父类独有的 methodFuOnly 方法");
    }
}

// 子类：继承父类 Fu
class Zi extends Fu {
    int num = 20; // 子类成员变量（与父类同名）

    public void show() {
        int num = 30; // 局部变量（与成员变量同名）

        // 1. 直接写 num：就近原则——先找局部变量，再找子类成员变量，最后找父类成员变量
        System.out.println("直接访问 num（就近原则）：" + num);         // 30，局部变量

        // 2. this.num：明确访问"子类"的成员变量
        System.out.println("this.num（子类成员变量）：" + this.num);   // 20

        // 3. super.num：明确访问"父类"的成员变量
        System.out.println("super.num（父类成员变量）：" + super.num); // 10
    }

    // 成员方法访问特点：重写（子类覆盖父类的实现）
    @Override
    public void methodFu() {
        System.out.println("子类重写后的 methodFu 方法");
    }

    public void methodZi() {
        System.out.println("子类独有的 methodZi 方法");
    }

    // 通过 super 调用父类被重写的原方法
    public void callFuMethod() {
        super.methodFu(); // 访问父类的 methodFu（没有走重写版本）
    }
}
