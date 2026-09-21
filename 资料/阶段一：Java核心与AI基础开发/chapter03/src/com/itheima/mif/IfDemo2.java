package com.itheima.mif;

public class IfDemo2 {
    /*
         if 语句中, 如果大括号控制的是一条语句, 大括号可以省略不写
         if 语句的 ( ) 和 { } 之间不要写分号
         if 语句的 ( ) 中需要产生 boolean 类型的结果, 根据结果决定程序的走向
     */
    public static void main(String[] args) {
        int age = 19;

        if (age >= 18) {
            System.out.println("可以上网吧");
        } else {
            System.out.println("未成年人禁止入内");
        }

        boolean flag = false;

        if(flag){

        }

    }
}
