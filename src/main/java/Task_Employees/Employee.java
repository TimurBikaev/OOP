package Task_Employees;

public class Employee {

    protected String name;
    protected int salary;

    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;

    }

    public void printInfo(){

        String info = name +": зарплата " + salary;

        System.out.println();
        System.out.println(info);
    }

}
