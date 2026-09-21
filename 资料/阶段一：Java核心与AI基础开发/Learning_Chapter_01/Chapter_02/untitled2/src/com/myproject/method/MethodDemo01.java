package com.myproject.method;

public class MethodDemo01 {
    public static void main(String[] args) {
        // 目标：掌握方法的完整定义格式

        // 需求1：求任意两个整数的和并返回
        int max = Get_Max(10, 20);
        System.out.println("最大的数是：" + max);

        // 需求2：完成使用方法求1-n的和并返回
        System.out.println("1-10的和是：" + Get_Sum(10));

        // 需求3：定义一个方法求一个整数是奇数还是偶数并输出
        Check(250);
    }

    public static int Get_Max(int a, int b) {
        int max = a > b ? a : b;
        return max;
    }

    public static int Get_Sum(int n){
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum += i;
        }
        return sum;
    }

    public static void Check(int number){
        if(number % 2 == 0){
            System.out.println(number + "是偶数");
        } else {
            System.out.println(number + "是奇数");
        }
    }

}
