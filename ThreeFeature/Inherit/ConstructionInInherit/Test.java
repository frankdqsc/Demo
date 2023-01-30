package ThreeFeature.Inherit.ConstructionInInherit;

/**
 * 测试类：演示构造方法的调用
 * 结论：
 *  子类所有构造方法的第一行都有一个默认的 super()用来访问父类的无参构造方法
 *  如果父类没有无参构造，可以通过 super(参数)来访问父类的带参构造
 */
public class Test {
    public static void main(String[] args) {
        //创建子类对象
        Worker w = new Worker();
    }
}
