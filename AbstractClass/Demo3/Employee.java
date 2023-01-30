package AbstractClass.Demo3;

public abstract class Employee {

    private String name;
    private double salary;
    private String id;

    //空参构造
    public Employee() {
    }
    //带参构造
    public Employee(String name, double salary, String id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }
    //get set
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    //方法
    public abstract void work();
}
