package com.myproject.Array_Demo_01;

public class demo_01 {
    public static void main(String[] args) {
        // 案例一：静态初始化——完整格式
        // 格式：数据类型[] 数组名 = new 数据类型[]{元素1, 元素2, ...};
        System.out.println("=== 案例一：完整格式 ===");
        int[] arr1 = new int[]{11, 22, 33, 44, 55};
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        System.out.println();

        // 案例二：静态初始化——简化格式（完整格式的简写，效果完全一样）
        // 格式：数据类型[] 数组名 = {元素1, 元素2, ...};
        System.out.println("=== 案例二：简化格式 ===");
        int[] arr2 = {66, 77, 88, 99};
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }
}
