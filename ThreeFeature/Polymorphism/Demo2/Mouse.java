package ThreeFeature.Polymorphism.Demo2;

public class Mouse extends Animal {
    @Override
    public void eat() {
        System.out.println(getName() + "eat rice");
    }
}
