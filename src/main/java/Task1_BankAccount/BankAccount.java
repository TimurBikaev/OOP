package Task1_BankAccount;

public class BankAccount implements Printable {

    private String accountNumber;
    private int balance;

    //сеттер принимает значение balance и присваивает его полю balance объекта
    public void setBalance(int balance) {
        this.balance = balance;
    }

    //геттер возвращает значение поля баланса
    public int getBalance() {
        return this.balance;
    }

    //установка номера аккаунта
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    //получение номера аккаунта
    public String getAccountNumber() {
        return this.accountNumber;
    }

    //реализация метода из интерфейса Printable
    @Override // аннотация для переопределения метода
    public void print() {
        //Выведем имя и баланс аккаунта
        System.out.println();
        System.out.println("Аккаунт номер " + getAccountNumber()
                + " имеет баланс " + getBalance());
        System.out.println();
    }

    //пополнение баланса
    public void refullment(int sum) {
        System.out.println();
        balance = this.balance + sum;
        System.out.println("Аккаунт " + this.accountNumber + " пополнен на сумму " + sum);
        print();
        System.out.println();
    }

    //снятие баланса
    public void recieve(int sum) {
        balance = this.balance - sum;
        System.out.println();
        System.out.println("С аккаунта " + this.accountNumber + " снята сумма " + sum);
        print();
        System.out.println();
    }
}
