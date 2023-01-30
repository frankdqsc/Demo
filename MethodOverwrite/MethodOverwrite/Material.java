package MethodOverwrite.MethodOverwrite;

/**
 * 父类，武功类
 * 4 大权限修饰符的修饰范围从小到大分别是： private，默认，protected，public
 * 子类 方法的访问权限不能比 父类的 低
 */
public class Material {
    //练习内功
    public void internalStrength(){
        System.out.println("练习内功");
    }
    //练习招式
    public void stroke(){
        System.out.println("练习招式");
    }
}
