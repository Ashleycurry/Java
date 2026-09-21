package com.itheima.operator;

public class OperatorDemo5 {
    /*
        逻辑运算符: 把多个条件放在一起运算, 最终返回true或者是false

        分类:
            &(与): 遇false则false
            |(或): 遇true则true
            !(非): 取反
            ^(异或): 相同为false, 不同为true
     */
    public static void main(String[] args) {
        System.out.println(true & false);
        System.out.println(false & true);
        System.out.println(false & false);
        System.out.println(true & true);
        System.out.println("---------------------");
        System.out.println(true | false);
        System.out.println(false | true);
        System.out.println(false | false);
        System.out.println(true | true);
        System.out.println("---------------------");
        System.out.println(!false);
        System.out.println(!true);
        System.out.println("---------------------");
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);
        System.out.println(true ^ true);
    }
}
