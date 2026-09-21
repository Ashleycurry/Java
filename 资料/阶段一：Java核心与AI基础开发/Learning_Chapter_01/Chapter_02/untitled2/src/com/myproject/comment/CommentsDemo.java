package com.myproject.comment;

// 在编译后的class中的注解会清除

/**
 * 3.文档注解
 * 一般用在类、方法上
 * 里面的内容可以提取到程序说明书去
 */
public class CommentsDemo {
    public static void main(String[] args) {
        // 1.单行注解
        System.out.println("单行注解");

        /*
           2.多行注解
           多行注解1
           多行注解2
           多行注解3
         */
        System.out.println("多行注解");
    }
}

