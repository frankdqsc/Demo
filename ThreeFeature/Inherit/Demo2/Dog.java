package ThreeFeature.Inherit.Demo2;

//定义一个狗类
public class Dog extends Animal{
    public Object watch;

    //额外定义一个 看家
    public void watch(){
        System.out.println("🐶会看家");
    }
}
