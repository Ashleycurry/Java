package com.itheima.test1;

public class Student extends Person {
    // 1. 有没有特有的成员变量 -> 有
    // 2. 有没有特有的成员方法 -> 没有
    // 3. 有没有需要重写的成员方法 -> 没有
    // 4. 子类需要自己编写构造方法
    private int score;

    public Student() {
    }

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
