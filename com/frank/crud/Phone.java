package com.frank.crud;

/**
 * 变量
 * 局部位置：在方法的参数列表或者方法体语句（方法内部）
 * 成员位置：在类中，方法外
 *
 * java中使用变量的规则
 *  使用变量遵循"就近原则"，如果局部位置有，就是用
 *  没有的话使用本类的成员变量，也没得话就去继承位置找。
 */
public class Phone {
    String brand;
    String model;
    String name;
    public void call(String name){
        //发短信
        System.out.println("给"+ name + "打电话");
    }
    public void sendMessage(){
        System.out.println("发短信");
    }
    public void playGame(){
        System.out.println("玩游戏");
    }
}
