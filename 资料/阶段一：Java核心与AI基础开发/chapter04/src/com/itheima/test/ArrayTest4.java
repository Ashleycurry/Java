package com.itheima.test;

public class ArrayTest4 {
    /*
        二维数组的遍历操作
     */
    public static void main(String[] args) {
        int[][] arr = {
                {11, 22, 33},
                {44, 55, 66}
        };

        // 外循环: 遍历二维数组, 取出每一个一维数组
        for (int i = 0; i < arr.length; i++) {
            // arr[i] : 每一个一维数组
            // 内循环: 继续遍历一维数组, 取出每一个元素
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }

    }
}
