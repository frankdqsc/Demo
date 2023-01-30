package Interface.Use;

/*
*  Interface： 接口
*       Provide a uniform specification  提供统一标准
*   Definition format ： 定义格式
*       interface interface_name()
*   The relation between class and interface, use keyword "implements" to express 接口和类的关系，使用 implement 表示
*       class class_name implements interface_name（）
* */
public class Test {
    public static void main(String[] args) {
        // interface is an abstract thing than abstract class, so can't instantiate directly, 接口比抽象类更抽象，不能直接实例化
        // Can instantiate through create a subclass object 可以用过创建子类对象实例化
        // Polymorphism 多态
        Smoking sm = new Teacher();
        sm.smoke();
    }
}
