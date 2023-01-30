package Interface.MemberFeature;

/*
*  接口中的成员特点：
*   成员变量：
*       接口中只有成员常量，没有成员变量，因为接口中所有的变量都有默认修饰符 public static final
*   成员方法：
*       JDK7 及以前只能定义抽象方法，因为所有方法都有默认修饰符 public abstract
*       JDK8 以后可以有带方法体的方法，静态方法可以直接写，非静态方法要用 default 修饰
*       JDK9 以后可以有私有方法，直接写即可
*   构造方法：
*       接口中没构造方法
* */
public class Test {
    public static void main(String[] args) {
        //测试接口中的成员变量
        System.out.println(Usb.NUM);
    }
}
