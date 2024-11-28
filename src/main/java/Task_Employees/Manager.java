package Task_Employees;

public class Manager extends Employee {

    private int bonus;


    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public void printInfo() {

        String info = name +": зарплата " + salary + ", бонус " + bonus;

        System.out.println();
        System.out.println(info);

    }
}
