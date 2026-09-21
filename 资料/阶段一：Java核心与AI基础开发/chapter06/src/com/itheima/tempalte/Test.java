package com.itheima.tempalte;

public class Test {
    /*
        设计模式: 一些优秀的程序员, 总结出来的经验.

        模板设计模式: 将抽象类整体看作为是一个模板, 模板中不能决定的内容, 定义为抽象方法
                        让使用模板的类, 补齐抽象方法的逻辑.
     */
    public static void main(String[] args) {
        Tony t = new Tony();
        t.write();

        Tom tt = new Tom();
        tt.write();
    }
}
