package com.itheima.stringbuilder;

public class StringBuilderDemo3 {
    /*
        StringBuilder的构造方法:

            1. public StringBuilder() : 创建一个空白的字符串缓冲区
            2. public StringBuilder(String str) : 创建一个字符串缓冲区, 并指定初始值.

        StringBuilder的成员方法:

            1. public StringBuilder	append(任意类型): 添加数据到缓冲区的尾部, 返回对象自己
            2. public StringBuilder	reverse() : 反转缓冲区的内容
            3. public int length() : 获取长度
            4. public String toString() : 转换为String类型
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        // 链式编程: 如果方法的返回值是对象, 就可以继续向下调用方法
        sb.append("红色").append("蓝色").append("绿色");
        System.out.println(sb);

        String[] arr = sb.toString().split("色");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    private static void method() {
        // 创建一个空白的字符串缓冲区
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1);

        // 创建一个字符串缓冲区, 并指定初始值.
        StringBuilder sb2 = new StringBuilder("abc");
        System.out.println(sb2);
    }
}
