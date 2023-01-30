package ThreeFeature.Polymorphism.Demo2;

/*
    已知父类 Animal，成员变量为：姓名，成员方法为 eat（）
    有两个子类 Dog()和 Mouse()，两个子类都重写了 Animal类中的 eat() 方法
    在测试类中，定义showAnimal()方法，用来测试 Dog类和 Mouse类
 */
public class Test {
    public static void main(String[] args) {
        //test dog class
        Dog d = new Dog();
        d.setName("Huskey");
        showAnimal(d);

        //test mouse class
        Mouse s = new Mouse();
        s.setName("Jerry");
        showAnimal(s);
    }

    /*
        定义showAnimal()方法，用来测试 Dog类和 Mouse类
        多态的使用场景
        父类型可以作为形参的数据类型，这样可以接收任意的子类对象
     */
    public static void showAnimal(Animal an){
        an.eat();
    }
/*
    public static void showAnimal(Dog d){
        d.eat();
    }
    public static void showAnimal(Mouse d){
        d.eat();
    }*/
}
