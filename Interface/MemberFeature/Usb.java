package Interface.MemberFeature;

public interface Usb {
    //成员常量
    public static final int NUM =10;

    //成员方法
    public abstract void open();
    public abstract void close();

    //JDK8 多了 2 种写法
    //静态方法
    public static void method1(){
        System.out.println(" Java8 new feature");
    }
    //非静态方法
    public default void method2(){
        System.out.println(" Java8 new feature");
    }

    //JDK9 多了 1 种写法
//    private void method3(){
//        System.out.println(" Java9 new feature");
//    }

    //接口中没构造方法
//    public USB(){
//    }
}
