package ThreeFeature.Inherit.ConstructionInInherit;

//父类
public class Person {
    //无参构造
//    public Person(){
//        System.out.println("person 类的空参构造");
//    }

    //带参构造
    public Person(String name){
        System.out.println("person 类的带参构造"+ name);
    }
}
