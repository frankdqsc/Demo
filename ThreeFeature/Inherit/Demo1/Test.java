package ThreeFeature.Inherit.Demo1;

//测试类

/**
 * 继承
 * 查找变量原则：就近原则
 * 查找变量顺序：局部变量-成员变量-父类-更高的父类-Object
 * 访问父类变量的方法：super.父类变量名
 * super: 当前对象父类的引用（父类内存空间的标识）
 * 对象初始化顺序：先初始化父类的内容，再初始化子类内容
 *
 * java 只支持类的单继承，接口的多继承
 * 私有成员不能继承
 * 构造方法不能继承
 */
public class Test {
    public static void main(String[] args) {
        Child c = new Child();

        //给对象 c 设置名字和年龄
        //c.name = "tom"; //在 Parent 类中 name 为私有变量，继承不到
        c.setName("Tomas");
        System.out.println(c.getName());
    }
}
