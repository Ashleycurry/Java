package com.myproject.Array_Demo_03;

public class demo_03 {
    public static void main(String[] args) {
        // 案例：数组遍历——依次访问每个元素
        int[] arr = {12, 45, 98, 73, 60};

        // 方式一：for 循环（通过索引遍历，能拿到索引 i）
        System.out.println("=== 方式一：for 循环 ===");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println();

        // 方式二：增强 for 循环（for-each，直接取出每个元素，语法更简洁）
        System.out.println("=== 方式二：增强 for 循环 ===");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println();

        // 遍历应用一：求和
        System.out.println("=== 应用一：遍历求和 ===");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("数组元素的和为：" + sum);

        System.out.println();

        // 遍历应用二：求最大值（max 先取第一个元素，再从第 2 个开始逐个比较）
        System.out.println("=== 应用二：遍历求最大值 ===");
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("数组元素的最大值为：" + max);

        System.out.println();

        // 遍历应用三：数组元素反转（首尾元素依次交换，向中间靠拢）
        System.out.println("=== 应用三：数组元素反转 ===");
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.print("反转后的数组：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
