package com.itheima.control;

public class ContinueDemo {
    /*
        continue: 跳过某次循环, 继续下一次循环
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if(i == 3 || i == 11){
                continue;

            }
            System.out.println("老师正在给第" + i + "同学发冰棍儿~~~");
        }
    }
}
