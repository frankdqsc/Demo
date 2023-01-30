package ThreeFeature.Polymorphism.Demo1;

//子类
public class Dog extends Animal {
    //需求： 因为狗吃骨头，所以要优化父类的 eat（）方法
    public void eat(){
        System.out.println(getName() + "eat bone");
    }
}
