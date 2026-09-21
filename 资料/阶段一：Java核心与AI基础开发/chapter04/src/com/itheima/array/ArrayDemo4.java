package com.itheima.array;

public class ArrayDemo4 {
    /*
        动态初始化：初始化时只指定数组长度，由系统为数组分配初始值
        格式：数据类型[] 数组名 = new 数据类型[数组长度];

        分类:
                整数: 0
                小数: 0.0
                布尔: false
                -----------------------
                字符: '\u0000'       Unicode字符  常见的体现是空白字符
                引用数据类型: null

        引用数据类型: 数组, 类, 接口

                字符串 --> 类 --> 引用数据类型
     */
    public static void main(String[] args) {
        String[] arr = new String[3];

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
