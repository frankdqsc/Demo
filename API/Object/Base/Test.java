package API.Object.Base;

/**
 *  Object类：
 *      概述：类层次结构最顶层的基类，所有类都直接或者间接继承自 Object 类
 *      构造方法： public Object()
 *      成员方法：
 *          int hashCode();
 *          Class<?> getClass();
 *          String toString();
 *          boolean equals();
 *
 *      注意：Java.lang 下的类可以直接使用，不用导包
 */
public class Test {
    public static void main(String[] args) {
        //非静态方法的调用方法，通过对象名的形式
        //创建 Object类型的对象
        Object obj1 = new Object();
        Object obj2 = new Object();

        //2. 测试 Object 类中的成员方法
        // int hashCode(); 返回对象的哈希码值，不同对象的哈希码值一般不同
        int code1 = obj1.hashCode();
        int code2 = obj2.hashCode();
        System.out.println(code1);
        System.out.println(code2);
        System.out.println("-------");

        // Class<?> getClass(),返回该调用者的字节码文件对象，一个类只有一个字节码文件对象
        Class class1 = obj1.getClass();
        Class class2 = obj1.getClass();
        System.out.println(class1);
        System.out.println(class2);
        System.out.println("-------");

        //String toString() 返回该对象的字符串表示形式，默认打印的是地址值，但是不同的对象的地址值肯定不同，地址值的组成：全类名+@+该对象的哈希码值的十六进制形式
        String s1 = obj1.toString();
        String s2 = obj1.toString();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("-------");

        // boolean equals() 比较两个对象是否相同，默认比较的是地址值，无意义，子类一般会重写这个方法
        boolean b1 = obj1.equals(obj2);
        System.out.println(b1);
    }
}
/*
class Person extends Object{

}

class Student extends Person{

}*/
