package ThreeFeature.Polymorphism.Demo2;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println(getName() +"eat bone");
    }
}
