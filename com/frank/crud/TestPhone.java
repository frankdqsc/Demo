package com.frank.crud;

/**
 * 手机类测试
 */
public class TestPhone {
    public static void main(String[] args) {
        //1.创建对象
        Phone p = new Phone();

        //2.给成员变量赋值后，调用成员变量，并打印
        p.brand = "iphone";
        p.model = "X";
        p.name = "frank";
        System.out.println(p.brand);
        System.out.println(p.name);
        System.out.println(p.model);

        //3.调用成员方法
        System.out.println("---------");
        p.call("Steve Job");
        p.sendMessage();
    }
}
