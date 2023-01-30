package ThreeFeature.Polymorphism.Demo1;

/*
    动物类案例
        已知父类 Animal，成员变量为：姓名 成员方法为： eat()方法
        有子类 Dog类，用此案例模拟多态
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 实现多态的步骤
         * 1. 要有继承或者实现关系
         * 2. 要有方法重写哈士奇eat bone
         * 3. 要有父类引用指向子类对象
         *
         * 结论：
         * 多态中调用成员方法是：
         * 编译看左边，看左边的类型有没有这个成员
         * 运行看右边，看右边类中的该成员
         */

        Animal an = new Dog(); //编译时 Animal 中有 eat，运行时用右边类中的 eat
        an.setName("Husky"+" ");
        an.eat(); //Husky eat bone 因为子类的 eat 重写了父类的
    }
}
