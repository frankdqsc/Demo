package ThreeFeature.Inherit.Demo3;

public class Apple extends Fruit {
    //成员变量
    int price = 10;
    public void showPrice(){
        //局部变量
        int price =5;
        System.out.println(price);
        System.out.println(this.price); // this --使用子类的成员变量
        System.out.println(super.price); // super -- 使用父类的成员变量
    }
}
