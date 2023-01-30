package MethodOverwrite.ToolPkg;

import MethodOverwrite.FourPermissionModifiers.Father;

/**
 *同包下的类
 *
 * private
 * 默认
 * protected
 * public
 */
public class Son extends Father {
    public static void main(String[] args) {
        Father f = new Father();
        //f.show1();

        //f.show2();
        //f.show3();
        f.show4();
        System.out.println("-------");

        Son s = new Son();
        //s.show2();
        s.show3();
        s.show4();
    }
}
