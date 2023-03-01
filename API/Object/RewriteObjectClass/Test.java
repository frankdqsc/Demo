package API.Object.RewriteObjectClass;

/**
 * 需求：定义一个标准的 JavaBean 类，并在测试类中进行测试
 *      学生类：Student
 *          属性：id name score
 */
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Frank",70);

/*      默认使用了该对象的 toString() 方法，在不重写 Object 中 toString 时，使用默认
        不重写时：API.Object.RewriteObjectClass.Student@1b6d3586
        重写时：Student{id=1, name='Frank', score=70} */

        System.out.println(s1);
        //System.out.println(s1.toString());

        //测试 equals 方法
        Student s2 = new Student(1, "Tim",6);
        boolean b1 = s1.equals(s2);
        System.out.println(b1);

    }
}
