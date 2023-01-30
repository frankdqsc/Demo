package AbstractClass.Demo2;

//subclass  1.重写父类所有的抽象方法
public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("cat eats fishes");
    }

    @Override
    public void sleep() {
        System.out.println("cat sleeps..");
    }
}
