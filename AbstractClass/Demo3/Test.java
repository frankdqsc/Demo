package AbstractClass.Demo3;

/**
 * 需求：公司有程序员和经理两种角色，共同属性有姓名，工资，工号和工作等，经理额外有奖金属性，使用继承设计类，完成对象创建和使用
 *
 * 经理 Manager 和程序员 Coder 都属于（继承） Employee,
 * 共同属性： name, salary, id, work
 * 经理属性： bonus
 */
public class Test {
    public static void main(String[] args) {
        //测试程序员类
        Employee em = new Coder();
        em.work();

        //测试经理类
        Employee em1 = new Manager();
        em1.work();
        System.out.println("----------");

        //快速实例化
        //需求：创建一个张三，工资2000，工号为007
        //此处是通过set实现的
        Coder c = new Coder();
        c.setName("张三");
        c.setId("007");
        c.setSalary(2000);
        System.out.println(c.getName()+ "工号为:"+ c.getId()+ "工资为:" + c.getSalary());
        System.out.println("----------");

        //通过父类构造方法实现
        Coder c1 = new Coder("王五",3000,"008");
        System.out.println(c1.getName()+ "工号为:"+ c1.getId()+ "工资为:" + c1.getSalary());
        System.out.println("----------");

        //创建一个名字叫王五，工号008，奖金为10000的经理
        Manager m = new Manager("王五", 40000,"008", 10000);
        System.out.println(m.getName()+ "工号为:"+ m.getId()+ "工资为:" + m.getSalary()+ "奖金为"+m.getBonus());
    }
}
