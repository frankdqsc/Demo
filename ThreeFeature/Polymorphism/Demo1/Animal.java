package ThreeFeature.Polymorphism.Demo1;

//父类
public class Animal {
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //成员方法
    public void eat(){
        System.out.println("eat..");
    }
}
