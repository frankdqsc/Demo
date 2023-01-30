package ThreeFeature.Inherit.ConstructionInInherit;

//子类
public class Worker extends Person{
    public Worker(){
        //super(); //默认
        super("Tom"); //默认
        System.out.println("Worker 类的空参构造");
    }
}
