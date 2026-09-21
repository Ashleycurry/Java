package com.itheima.test;

import java.util.Scanner;

public class StringTest1 {
    /*
        需求：已知正确的用户名和密码，请用程序实现模拟用户登录。
                总共给三次机会，登录之后，给出相应的提示
     */
    public static void main(String[] args) {
        // 1. 定义两个字符串变量, 模拟数据库中存在的数据
        String username = "admin";
        String password = "1234";

        // 2. 键盘录入用户名和密码
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入用户名和密码: ");
            String inputUsername = sc.next();
            String inputPassword = sc.next();

            // 3. 和正确的用户名密码进行比对
            if (username.equals(inputUsername) && password.equals(inputPassword)) {
                System.out.println("登录成功");
                break;
            } else {
                if (i == 3) {
                    System.out.println("明儿再来吧!");
                } else {
                    System.out.println("登录失败, 您还剩余" + (3 - i) + "次机会");
                }
            }
        }
    }
}
