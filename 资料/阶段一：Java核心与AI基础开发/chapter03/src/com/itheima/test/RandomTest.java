package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        guessNumber();
    }

    public static void guessNumber() {
        // 1. 召唤Random精灵
        Random r = new Random();
        // 2. 召唤Scanner精灵
        Scanner sc = new Scanner(System.in);
        // 3. 指挥Random产生随机数  int randomNumber
        int randomNumber = r.nextInt(100) + 1;

        while (true) {
            // 4. 录入用户猜的数据  int inputNumber
            System.out.println("请输入: ");
            int inputNumber = sc.nextInt();
            // 5. 比大小, 给出提示
            if (inputNumber > randomNumber) {
                System.out.println("猜大了!");
            } else if (inputNumber < randomNumber) {
                System.out.println("猜小了!");
            } else {
                System.out.println("恭喜, 猜中了!");
                break;
            }
        }
    }
}
