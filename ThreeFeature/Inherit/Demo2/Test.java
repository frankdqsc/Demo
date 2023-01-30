package ThreeFeature.Inherit.Demo2;

public class Test {
    public static void main(String[] args) {
        //测试狗类
        Dog d = new Dog();
        d.eat();
        d.watch();
        System.out.println("-------------");
        //测试猪类
        Pig p = new Pig();
        p.eat();
        p.snore();

    }
}
