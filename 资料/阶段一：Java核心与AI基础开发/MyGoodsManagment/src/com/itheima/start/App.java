package com.itheima.start;

import com.itheima.pojo.Goods;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    // 增删改查都是围绕着这个集合进行操作
    static ArrayList<Goods> list = new ArrayList<>();

    // 静态代码块中准备测试数据
    static {
        list.add(new Goods("001", "华为平板", 3999, "平板电脑"));
        list.add(new Goods("002", "华为手机", 6999, "手机"));
        list.add(new Goods("003", "华为电脑", 8999, "电脑"));
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("-------------欢迎使用商品管理系统-------------");
            System.out.println("1. 添加商品");
            System.out.println("2. 删除商品");
            System.out.println("3. 修改商品");
            System.out.println("4. 查询全部商品");
            System.out.println("5. 查询单个商品");
            System.out.println("6. 退出");
            System.out.println("--------------------------------------------");
            System.out.println("请输入您的选择: ");

            String choice = sc.next();

            switch (choice) {
                case "1":
                    addGoods();
                    break;
                case "2":
                    deleteGoodsById();
                    break;
                case "3":
                    updateGoodsById();
                    break;
                case "4":
                    queryAllGoods();
                    break;
                case "5":
                    queryGoodsById();
                    break;
                case "6":
                    System.out.println("感谢您的使用, 再见!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("您输入有误, 请检查后重新输入!");
                    break;
            }
        }
    }

    /**
     * 添加商品到集合
     */
    private static void addGoods() {
        System.out.println("请输入商品编号: ");
        String id = sc.next();
        // 确保id的唯一性
        while (getIndex(id) != -1) {
            System.out.println("您输入的编号已存在, 请重新输入:");
            id = sc.next();
        }
        System.out.println("请输入商品名称: ");
        String name = sc.next();
        System.out.println("请输入商品价格: ");
        double price = sc.nextDouble();
        System.out.println("请输入商品描述: ");
        String desc = sc.next();
        Goods goods = new Goods(id, name, price, desc);
        list.add(goods);
        System.out.println("添加成功!");
    }

    /**
     * 根据id查询单个商品
     */
    private static void queryGoodsById() {
        System.out.println("请输入要查询的商品编号：");
        String id = sc.next();
        int index = getIndex(id);
        if (index == -1) {
            System.out.println("您输入的编号不存在!");
        } else {
            System.out.println("查找到的商品信息为: ");
            Goods goods = list.get(index);
            System.out.println(goods);
        }
    }

    /**
     * 修改商品
     */
    private static void updateGoodsById() {
        System.out.println("请输入要修改的商品编号：");
        String id = sc.next();
        int index = getIndex(id);
        if (index == -1) {
            System.out.println("您输入的编号不存在!");
        } else {
            System.out.println("请输入要修改的商品名称：");
            String name = sc.next();
            System.out.println("请输入要修改的商品价格：");
            double price = sc.nextDouble();
            System.out.println("请输入要修改的商品描述：");
            String desc = sc.next();
            Goods goods = new Goods(id, name, price, desc);
            list.set(index, goods);
            System.out.println("修改成功!");
        }
    }

    /**
     * 根据商品编号, 删除集合中商品对象
     */
    private static void deleteGoodsById() {
        System.out.println("请输入您要删除的商品编号: ");
        String id = sc.next();
        // 调用getIndex方法, 查找id在集合中的索引
        int index = getIndex(id);

        if (index == -1) {
            System.out.println("您输入的商品号码不存在! 请检查!");
        } else {
            // 商品号码存在, 根据索引做删除
            list.remove(index);
            System.out.println("删除成功!");
        }
    }

    /**
     * 查看全部商品信息
     */
    private static void queryAllGoods() {
        System.out.println("商品信息如下: ");
        for (int i = 0; i < list.size(); i++) {
            Goods goods = list.get(i);
            System.out.println(goods);
        }
    }

    /**
     * 根据商品编号, 查找该商品在集合中的索引位置
     */
    public static int getIndex(String id) {
        // 遍历集合, 获取每一个商品对象
        for (int i = 0; i < list.size(); i++) {
            Goods goods = list.get(i);
            // 从商品对象中获取编号, 和要查找的编号进行比对
            if (goods.getId().equals(id)) {
                // 返回正确的索引
                return i;
            }
        }
        // 没找到, 返回-1标记
        return -1;
    }
}
