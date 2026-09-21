package com.itheima.loop;

public class ForDemo1 {
    /*
        1. 执行初始化语句, 在整个循环期间, 只执行一次
        2. 执行判断条件, 看其返回的结果是true, 还是false
                false : 循环结束
                true : 进入第三步
        3. 执行循环体语句
        4. 执行条件控制语句
        5. 回到2继续
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("跑圈");
        }

        System.out.println("---------------------------");

        for (int a = 1; a <= 10; a++) {
            System.out.println("黑马程序员");
        }
    }
}
