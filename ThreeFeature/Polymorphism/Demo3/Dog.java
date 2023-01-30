package ThreeFeature.Polymorphism.Demo3;

public class Dog extends Animal{
    String name = "Dog";

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
    //狗特有的方法，父类没有的成员方法
    public void watch() {
        System.out.println("狗会看家");
    }
}
