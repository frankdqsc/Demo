package AbstractClass.Demo2;

/**
 *  抽象类：
 *      有抽象方法的类，用 abstract 关键词修饰
 *  抽象方法：
 *      没有方法体的方法，用 abstract 关键词修饰
 *  为什么需要抽象方法？
 *      当需要一个方法，但是不确定方法的具体实现时，可以将方法定义为 abstract，具体实现交给子类
 *  特点：
 *      修饰符：必须使用 abstract 关键词修饰
 *             修饰符 abstract class 类名{}
 *             修饰符 abstract 返回类型 方法名{}
 *      抽象类不能被实例化，只能创建子类对象
 *      抽象类子类的两个选择：
 *          1.重写父类所有的抽象方法
 *          2.定义成抽象类
 *
 *  抽象类成员的特点：
 *      成员变量：可以有普通的成员变量，也可以有成员常量（final）
 *      成员方法：可以有普通方法，也可以有抽象方法、抽象类不一定含有抽象方法，但是有抽象方法的类一定是抽象类（或接口）
 *      构造方法：像普通类一样有构造方法，而且可以重载
 *
 *  总结： 抽象类中的成员比普通类多一种：抽象方法
 *        其他和普通类一样
 */
public class Test {
    public static void main(String[] args) {
        //抽象类不能 new ,即不能实例化
        //Animal an = new Animal();

        //初始化抽象类
        Animal an = new Cat();
        an.eat();
        an.sleep();

        //抽象类的成员特点
        an.name = "Tom";
        System.out.println(an.name);

        //an.AGE = 50; // 报错，常量值不能修改
        System.out.println(an.AGE);
    }
}
