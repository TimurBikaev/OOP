package Task_Bank;

public class CheckingAccount extends BankAccount{

    //конструктор из наследника
    public CheckingAccount(String accountNumber, double balance){
        super(accountNumber, balance);
        System.out.println();
        System.out.println("Создан аккаунт без начисления процента " + accountNumber + " и суммой " + balance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("На счет этого типа не начисляются проценты");

    }
}
