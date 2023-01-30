package StaticKeyWord.Varible;

public class Developer {
    //成员变量
    String name;
    String work;

    //公共的静态常量
//    public static String DepartmentName = "DevPart";
    //如果只允许修改一次，可加 final 修饰
//    public final static String departmentName = "DevPart";
    //常量用大写
    public final static String DEPARTMENT_NAME = "DevPart";
    //成员方法
    public void selfIntroduction(){
        System.out.println("我是"+ DEPARTMENT_NAME + "的" + name +"我的工作是" + work);
    }
}
