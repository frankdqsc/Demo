package AbstractClass.Demo3;

public class Manager extends Employee{
    //生成构造方法


    public Manager() {
    }

    public Manager(String name, double salary, String id, int bonus) {
        super(name, salary, id);
        this.bonus = bonus;
    }

    private int bonus;

    //私有属性提供get set 方法

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("watching coding");
    }
}
