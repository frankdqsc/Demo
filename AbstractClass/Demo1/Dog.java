package AbstractClass.Demo1;

public class Dog extends Animal{
    //cause superclass not achieve method, so subclass have to override method.
    @Override
    public void eat() {
        System.out.println("dog eats bone");
    }
}
