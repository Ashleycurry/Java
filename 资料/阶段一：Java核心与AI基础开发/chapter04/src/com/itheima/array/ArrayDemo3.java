package com.itheima.array;

public class ArrayDemo3 {
    /*
        数组遍历操作: 依次访问数组中的每一个元素

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        弊端: 代码过于臃肿
        优化: 使用循环来进行优化

        for(int i = 0; i < 5; i++){
            // i = 0 1 2 3 4
            System.out.println(arr[i]);
        }

        弊端: 数组的长度不是动态获取的
        优化: 数组名.length

        -------------------------------------------

        数组的通用遍历方式:

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        数组名.fori + 回车
     */
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
