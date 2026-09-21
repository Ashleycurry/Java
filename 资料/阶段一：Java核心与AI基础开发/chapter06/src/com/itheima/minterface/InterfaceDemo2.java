package com.itheima.minterface;

public class InterfaceDemo2 {
    /*
        接口的成员特点:
            1. 成员变量: 只能是常量, 因为默认加入三个关键字 public static final
            2. 成员方法: 只能是抽象方法, 因为默认加入了两个关键字 public abstract
            3. 构造方法: 没有
     */
    public static void main(String[] args) {
        System.out.println(MyInter.NUM);
    }
}

class MyInterImpl extends Object implements MyInter {

    public MyInterImpl(){
        super();
    }

    @Override
    public void show() {

    }
}