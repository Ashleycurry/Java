package com.itheima.method;

public class MethodDemo1 {
    /*
        方法注意事项:
            1. 方法与方法之间是平级关系, 不允许嵌套定义
            2. 方法不调用就不执行
            3. 方法的定义顺序和执行顺序无关

        方法的好处:
            1. 提高了代码的阅读性, 维护性
            2. 提高代码的复用性
     */

    public static void cook() {
        System.out.println("买菜");
        System.out.println("洗菜");
        System.out.println("做菜");
    }

    public static void main(String[] args) {
        framer();
        cook();
        me();
    }

    public static void me() {
        System.out.println("点菜");
        System.out.println("吃菜");
    }

    public static void framer() {
        System.out.println("除草");
        System.out.println("耕地");
        System.out.println("播种");
        System.out.println("浇水");
        System.out.println("收割");
    }

    public static void eat() {
        System.out.println("今天吃了一顿饭");
    }
}
