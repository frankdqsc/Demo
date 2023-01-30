package ThreeFeature.Inherit.Demo2;

//定义父类，放共性内容
public class Animal {
    //共有的成员变量

    private String name;
    private int age;
    private String sex;

    public Animal() {
    }

    public Animal(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    //共有的成员方法-吃饭
    public void eat(){
        System.out.println("我会吃饭");
    }
}
