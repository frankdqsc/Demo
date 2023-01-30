package StaticKeyWord.Method;

/*
*   static 修饰成员方法
*   静态方法：
*       静态方法中没有对象 this, 所以不能访问非静态成员
*   静态方法的使用场景：
*       如果某方法只能访问静态成员，并且不需要通过对象名的形式调用，就可以考虑将其定义为：静态方法
*
*   需求：定义静态方法，翻转数组中的元素
*       核心：
*           1. arr[i] 和 arr[length -i -1] 的交换
*           2. 循环次数只需执行数组长度的一半就可以，即 arr.length/2
* */
public class Test {
    public static void main(String[] args) {
        //测试 show 方法
        Num.show();
    }
}
