package AbstractClass.Demo2;

//superclass
public abstract class Animal {
    //可以有构造方法，构造方法可以重载
    public Animal(){}
    public Animal(String name){
        this.name = name;
    }


    //成员变量：值可以变化
    String name = "husky";
    //成员常量：值不变
    final int AGE = 30;


    //抽象方法
    public abstract void eat();
    public abstract void sleep();

    //非抽象方法
    public void call(){
        System.out.println("Animal can call");
    }
}
