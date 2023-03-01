package API.Object.RewriteObjectClass;

import java.util.Objects;

public class Student {
    //成员变量
    private int id;
    private String name;
    private int score;
    //构造方法
    public Student() {
    }
    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }
    //成员方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    //toString() 重写
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    //equals() 用来比较2个对象是否相同，自定义的重写，假设id相同，2个对象就是同一个对象
/*    public boolean equals(Object obj){ // s1.equals(s2)

*//*      s2赋值给父类 object 后就向上转型-多态（父类的引用不能使用子类的特有成员）
        return this.id == obj.id; *//*
        //向下转型
        Student s2 = (Student)obj;
        return this.id == s2.id;
    }*/

    //自动生成 equals
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass()) //same class judge
            return false;
        Student student = (Student) o;
        return id == student.id && score == student.score && name.equals(student.name);
    }
}
