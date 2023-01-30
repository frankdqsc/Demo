package ThreeFeature.Polymorphism.Demo3;

/*
    测试多态关系中，成员变量的使用
    结论：多态关系中，成员变量是不涉及到重写的

    多态关系中，使用成员变量，遵循：编译看左，运行看左。
    编译看左：在编译期间会看左边的类型有没有这个成员，没有会报错
    运行看左：在运行期间使用的是左边的类型中的这个成员。

    注意：
        只能在继承层次内进行转换，否则会报 classCastException异常
        将父类对象转换成子类之前，可以使用 instanceOf进行检查，意思是判断前面的对象是否是后边的数据类型。
 */
public class Test {
    public static void main(String[] args) {
        //通过多态的方式创建对象，然后测试成员变量的使用
        //多态：父类引用指向子类对象
        Animal an = new Dog();// new Dog()调用狗类 ； new Animal() 调用父类

        //调用eat（）方法
        an.eat();
        //an.watch(); 父类没 watch
        //通过类型转换实现调用
        //Dog dog = (Dog)an;
        //dog.watch();

        //不正常的转换
        //Cat c = (Cat)an;

        //优化：先判断当前对象是否是 Dog 类型的对象，如果是再调用 watch()方法
        if(an instanceof Dog){ //判断 an 是否是 Dog 类型的对象
            Dog dog = (Dog) an;
            dog.watch();
        }
//        System.out.println(an.name);
    }
}
