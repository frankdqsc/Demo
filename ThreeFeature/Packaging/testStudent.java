package ThreeFeature.Packaging;

public class testStudent {
    public static void main(String[] args) {
        /**
         * private
         * 私有的，是一种访问权限修饰符，用来修饰类的成员
         * 特点：被他修饰的成员只能在本类中使用
         * 使用：private 一般修饰成员变量， public 一般修饰成员方法
         */
        //创建学生类的对象
        Student stu = new Student();
        stu.setAge(23);
        stu.setName("frank");
        System.out.println(stu.getAge());
        stu.study();
        stu.show();

        //带参数构造器
        Student stu1 = new Student("Tom", 88);
        System.out.println(stu1.getName() + stu1.getAge());
    }
}
