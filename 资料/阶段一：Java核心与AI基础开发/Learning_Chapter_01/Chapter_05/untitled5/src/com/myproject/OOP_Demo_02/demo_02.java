package com.myproject.OOP_Demo_02;

public class demo_02 {
    public static void main(String[] args) {
        // 案例：封装思想 + 权限修饰符
        // 权限范围从小到大：private（仅本类）→ 默认（本类+同包）→ protected（本类+同包+跨包子类）→ public（任意位置）
        System.out.println("=== 案例：封装思想 + 权限修饰符 ===");

        Student s = new Student();

        // 一、封装：属性 private，通过 public 的 get/set 访问
        s.setName("小明");
        s.setAge(18);
        System.out.println("姓名：" + s.getName() + "，年龄：" + s.getAge());

        // set 里的校验逻辑拦截非法数据
        s.setAge(-5);
        System.out.println("尝试设置为 -5 后，年龄还是：" + s.getAge());

        System.out.println();

        // 二、权限修饰符：同一个包中的 demo_02 类能调用哪些方法？
        s.study();          // public：任何位置都能调用
        s.saySchool();      // 默认权限：同一个包中能调用
        s.sayProtected();   // protected：同一个包中能调用
        // s.saySecret();   // private：只有 Student 类自己能用，取消注释会编译报错

        System.out.println();

        // 三、private 成员怎么给外部用？由类自己提供 public 方法间接访问
        s.showSecret();
    }
}

// 学生类
class Student {
    // 属性 private 封装：外部不能直接访问，避免被随意修改
    private String name;
    private int age;
    private String secret = "我的小秘密";

    // public 的 get/set 方法：对外的安全入口
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // 校验逻辑：数据不合法就拒绝修改，保护数据安全
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("年龄 " + age + " 不合法，赋值被拒绝");
        }
    }

    // ① public：任意位置都能调用
    public void study() {
        System.out.println("public 方法 study()：任意位置可调用");
    }

    // ② 默认权限（不写修饰符）：同一个包中的类可调用
    void saySchool() {
        System.out.println("默认权限方法 saySchool()：同包可调用");
    }

    // ③ protected：同包可调用（跨包的子类也能调用，学到继承时再验证）
    protected void sayProtected() {
        System.out.println("protected 方法 sayProtected()：同包可调用");
    }

    // ④ private：只有本类内部可调用
    private void saySecret() {
        System.out.println("private 方法 saySecret()：" + secret);
    }

    // 类自己提供的公开入口，间接调用 private 方法
    public void showSecret() {
        saySecret();
    }
}
