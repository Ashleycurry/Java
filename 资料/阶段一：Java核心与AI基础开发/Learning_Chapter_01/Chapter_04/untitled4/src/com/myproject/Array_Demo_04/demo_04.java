package com.myproject.Array_Demo_04;

public class demo_04 {
    public static void main(String[] args) {
        // 案例一：静态初始化——创建时直接给出元素值
        System.out.println("=== 案例一：静态初始化 ===");
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.print("arr1 的元素：");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        System.out.println();

        // 案例二：动态初始化——只指定长度，元素由系统自动赋默认值
        // 默认值规则：整数 0、小数 0.0、布尔 false、字符 空字符、引用类型（如 String）null
        System.out.println("=== 案例二：动态初始化 ===");
        int[] arr2 = new int[5];
        System.out.print("arr2 的默认元素：");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        // 动态初始化的特点：先创建、后赋值
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (i + 1) * 10;
        }
        System.out.print("赋新值后的 arr2：");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }
}
