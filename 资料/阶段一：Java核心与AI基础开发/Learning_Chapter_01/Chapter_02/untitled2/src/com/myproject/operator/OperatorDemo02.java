package com.myproject.operator;

public class OperatorDemo02 {
    public static void main(String[] args) {
        // 逻辑运算符 与 &
        double height = 168.5;
        char sex = '男';
        System.out.println(height > 160 & sex == '女');

        // 逻辑运算符 或 |
        double height2 = 171.2;
        int age = 32;
        System.out.println(height2 > 160 | age < 30);

        // 逻辑运算符 非 ！
        System.out.println(!(2 > 1));
        System.out.println(!true);
        System.out.println(!false);

        // 逻辑运算符 异或 ^ 前后条件不一样才是true
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        // 逻辑运算符 短路与 && 左边false右边不再执行
        // & 即使左边是false但是依然执行右边
        int i = 10;
        int j = 666;
        // System.out.println(i < 1 & ++j > 333);
        System.out.println(i < 1 && ++j > 333);
        System.out.println(j);

        // 逻辑运算符 短路或 || 前后有一个true就是true 左边是true就不执行右边
        // | 即便左边是true依然执行右边
        int m = 100;
        int n = 999;
        // System.out.println(m > 1 | ++n > 198); //true
        System.out.println(m > 1 || ++n > 198); //true
        System.out.println(n);

    }
}
