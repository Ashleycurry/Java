package com.myproject.Array_Demo_05;

public class demo_05 {
    public static void main(String[] args) {
        // 案例：二维数组——初始化、元素访问、遍历
        // 格式：数据类型[][] 数组名 = {{第1行元素}, {第2行元素}, ...};
        System.out.println("=== 案例：二维数组 ===");
        int[][] arr = {
                {11, 22, 33},
                {44, 55, 66},
                {77, 88, 99}
        };

        // 1. 元素访问：数组名[行索引][列索引]，索引都从 0 开始
        System.out.println("第 1 行第 1 列 arr[0][0] = " + arr[0][0]);
        System.out.println("第 2 行第 3 列 arr[1][2] = " + arr[1][2]);
        System.out.println("第 3 行第 3 列 arr[2][2] = " + arr[2][2]);

        // 2. 长度：arr.length 是行数，arr[i].length 是第 i 行的列数
        System.out.println("行数 arr.length = " + arr.length);
        System.out.println("第 1 行的列数 arr[0].length = " + arr[0].length);

        System.out.println();

        // 3. 遍历：外层循环控制行，内层循环控制列
        System.out.println("遍历整个二维数组：");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // 一行遍历完换行
        }
    }
}
