package StaticKeyWord.Varible;

/*
*  static 为静态的意思，可以用来修饰成员变量和成员方法
*  修饰成员变量：该变量叫作静态变量（类变量），静态变量被该类下的所有对象所共享
*  静态成员的调用方法：可以通过类名，的形式直接调用
*
*  需求：定义研发部成员类，让每位成员进行自我介绍
*       Developer类：
*           成员变量：name, work, developmentName
*           成员方法：selfIntroduction
* */
public class Test {
    public static void main(String[] args) {
        Developer d1 = new Developer();
        d1.name = "frank";
        d1.work = "programing";
//        d1.departmentName = "DevPart";
        //为了避免这种修改 加 static
        //d1.DEPARTMENT_NAME = "MinistryPart"; //我是MinistryPart的frank我的工作是programing  同时也将 d2 部门修改为了 MinistryPart!!!
        d1.selfIntroduction();

        Developer d2 = new Developer();
        d2.name = "Soya";
        d2.work = "cleaning";
//        d2.departmentName = "DevPart";
        d2.selfIntroduction();
        System.out.println("-----------------");

        //随着公司发展，部门名称需要更改为： EngineeringDepart
        //Developer.DEPARTMENT_NAME = "EngineeringDepart";
        d1.selfIntroduction();
        d2.selfIntroduction();
    }

}
