package Task_Employees;

public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee("Иван", 30000);
        Manager mgr = new Manager("Ольга", 50000, 10000);

        emp.printInfo(); // Иван: зарплата 30000
        mgr.printInfo(); // Ольга: зарплата 50000, бонус 10000



    }
}
