package ThreeFeature.Packaging;
/*
    Object-Oriented Program
    体现：类和方法

    封装
    将一系列相关事务中共同的属性和行为提取出来，放到一个类中，隐藏对象的属性和实现细节，仅对外提供公共的访问方式。
    关键：决不能让类中的方法直接访问其他类的数据（属性），程序仅通过对象的方法与数据进行交互。

    Private 修饰成员变量
    1.给成员变量添加 private 修饰后，测试类中将不能直接访问
    2.由于 private 的属性，需要在 phone 类中添加访问该属性的方法，供其他类调用
    3.属性的操作一般都是取值和赋值，所以添加对应的公共方法 getXXX() setXXX()
    4.在测试类中通过getXXX()和setXXX(参数)来实现属性的访问

    this
    解决局部变量和成员变量重名问题，谁调用就指向谁
    用法：
    this.属性名；
    this.方法名（参数）;

    构造方法
    作用：初始化对象
    格式：修饰符 构造方法名（参数列表）{
        //方法体
    }
    要求：构造方法名和类名相同(区分大小小)
         构造方法没有返回值(但是可以写 return)
         构造方法没有返回值类型(连 void 也不能写)
    注意：若无构造方法，系统默认无参构造方法。
         构造方法可以重载
 */
public class Student {
    //成员变量
    String name;
    private int age;

    public Student() {
    }

    //提供公共的访问方式
    public void setAge(int a) { //优化--> this.age = age;
        age = a;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void study(){
        System.out.println(name + "正在学习...");
    }
    public void show(){
        int age = 10;
        System.out.println(age);
        System.out.println(this.age);
    }

    //带参数构造器
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
