package com.itheima.order;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:  1. 国内订单   2. 国外订单");

        int choice = sc.nextInt();

        OrderService orderService = null;

        switch (choice) {
            case 1:
                // 创建国内订单的业务类
                orderService = new OrderServiceImpl();
                break;
            case 2:
                // 创建国外订单的业务类
                orderService = new OverseasServiceImpl();
                OverseasServiceImpl o = (OverseasServiceImpl) orderService;     // Zi z = (Zi)f;
                o.check();
                break;
        }

        orderService.create();
        orderService.findOne();
        orderService.findList();
        orderService.cancel();
        orderService.finish();
        orderService.paid();


    }
}
