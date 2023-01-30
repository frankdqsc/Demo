package MethodOverwrite.FourPermissionModifiers;

/**
 *            同包下的类   不同包下的子类    不同包下的无关类
 *
 * private
 * 默认           ✅
 * protected     ✅          ✅
 * public        ✅          ✅              ✅
 *
 * 结论：private 给自己来使用
 *      默认 给同包下的类使用
 *      protected 给子类使用
 *      public 给大家使用
 */
public class Son extends Father {
    public static void main(String[] args) {
        Father f = new Father();
        //f.show1();
        f.show2();
        f.show3();
        f.show4();
        System.out.println("-------");

        Son s = new Son();
        s.show2();
        s.show3();
        s.show4();
    }
}
