package com.itheima.test1;

public class Teacher extends Person {
    // 1. 有没有特有的成员变量需要补充 -> 没有
    // 2. 有没有特有的方法需要补充 -> 没有
    // 3. 有没有需要重写的方法 -> 没有
    // 4. 子类需要自己编写构造方法
    public Teacher() {
        super();
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

}
