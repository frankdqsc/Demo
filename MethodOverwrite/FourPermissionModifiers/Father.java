package MethodOverwrite.FourPermissionModifiers;

/**
 *  本类中均可访问
 * private
 * 默认
 * protected
 * public
 */
public class Father {
    private void show1(){
        System.out.println("show1 private");
    }

    void show2(){
        System.out.println("show2 default");
    }

    protected void show3(){
        System.out.println("show3 protected");
    }

    public void show4(){
        System.out.println("show4 public");
    }

    public static void main(String[] args) {
        Father f = new Father();
        f.show1();
        f.show2();
        f.show3();
        f.show4();

    }
}
