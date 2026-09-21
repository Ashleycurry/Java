package com.itheima.test;

public class ForTest {
    public static void main(String[] args) {
        int count = getCount();
        System.out.println("水仙花数的个数为:" + count);
    }

    // 案例1: 模拟计时器
    public static void timer() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }

        for (int i = 3; i >= 1; i--) {
            System.out.println(i);
        }

        for (int i = 10; i >= 1; i--) {
            System.out.println("倒计时:" + i + "秒");
        }
        System.out.println("下课了!!!");
    }

    // 案例2: 求偶数和
    public static int getEvenNumberSum() {
        // 1. 定义求和变量, 准备记录累加后的结果
        int sum = 0;
        // 2. 使用循环, 获取1~100之间的每一个数字
        for (int i = 1; i <= 100; i++) {
            // 3. 使用if筛选偶数
            if (i % 2 == 0) {
                // 4. 累加求和
                sum += i;
            }
        }
        // 5. 循环结束后, 返回求和结果
        return sum;
    }

    // 案例2: 求偶数和 (优化后)
    public static int getEvenSum() {
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            // 2 4 6 8 10 12...
            sum += i;
        }
        return sum;
    }

    // 案例3: 打印所有的水仙花数
    public static void printNarcissusNumber() {
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                System.out.println(i);
            }
        }
    }

    // 案例4: 统计水仙花数的个数
    public static int getCount() {
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                System.out.println(i);
                count++;
            }
        }
        return count;
    }
}
