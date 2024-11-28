package Task_Bank;

public abstract class BankAccount {

    private  String accountNumber;
    double balance;//balance -- должен быть private-package чтобы к нему был доступ из папки!

    public BankAccount(){};

    // Конструктор
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public  void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public  void setBalance(double balance) {
        this.balance = balance;
    }

//    //инициализация аккаунта с начальным балансом
//    public BankAccount(String accountNumber, double balance){
//        System.out.println();
//        System.out.println("Создание счета " + accountNumber);
//        this.accountNumber = accountNumber;
//        this.balance = balance;
//        getBalance();
//    }

    //получение баланса
    public void getBalance(){
        System.out.println();
        System.out.println("Текущий баланс счета " + accountNumber + " составляет " + this.balance);
        System.out.println();
    }

    //пополнение текущего баланса
    public void deposit(double amount){
        if (amount > 0) {
            System.out.println();
            System.out.println("Внесение " + amount + " на счет " + accountNumber);
            this.balance = balance + amount;
            getBalance();
        }
        else System.out.println("Сумма пополнения должна быть больше 0.");
    }

    //снятие средств с текущего баланса, если достаточно
    public void withdraw(double amount){
        if (amount <= this.balance){
            System.out.println("Получение "+ amount + " со счета " + accountNumber);
        this.balance = balance - amount;
        getBalance();
        }
        else System.out.println("На балансе недостаточно средств");
    }

    // Абстрактный метод для расчета процентов
    public abstract void calculateInterest();


}
