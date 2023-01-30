package StaticKeyWord.Method;

public class Num {
    int num1 = 10;
    static int num2 = 20;

    public static void show() {
        //System.out.println(num1); //静态方法中访问不了非静态成员
        System.out.println(num2);
    }

}

