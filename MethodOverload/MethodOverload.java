package MethodOverload;

public class MethodOverload {
    /*
    方法重载概念：同一个类中的多个方法，方法名相同，参数列表不同
        参数列表不同：
            参数个数不同
            参数对应的数据类型不同

            方法重载与方法的返回值类型无关，与方法的修饰符无关
     需求：定义方法，分别比较两个int/long/double数是否相同
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        long c = 10L;
        long d = 20L;
        double e = 12.45;
        double f = 12.45;
        System.out.println(compare(a,b));
        System.out.println(compare(c,d));
        System.out.println(compare(e,f));
    }
    public static boolean compare(int a, int b){
        System.out.println("比较两个整型数是否相同");
        return a==b;
    }
    public static boolean compare(long a, long b){
        System.out.println("比较两个长整型数是否相同");
        return a==b;
    }
    public static boolean compare(double a, double b){
        System.out.println("比较两个双精度浮点数是否相同");
        return a==b;
    }
}

/**
 *              方法重载和方法重写的区别
 *        重载 overload               重写 override
 *  方法名：相同                            相同
 *  参数列表：不同（个数或者对应位置类型）       相同
 *  返回值类似：无关                         相同
 *  修饰符：无关                            访问权限不小于被重写方法
 *  定义位置：同一个类                       子父类中
 */