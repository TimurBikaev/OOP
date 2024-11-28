package Task_Bank;

// Класс SavingsAccount, наследующий BankAccount
public class SavingsAccount extends BankAccount {

    // Конструктор
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
        System.out.println();
        System.out.println("Создан аккаунт с начислением процента " + accountNumber + " и суммой " + balance);
    }

    // Реализация метода calculateInterest
    @Override
    public void calculateInterest() {
        //balance -- должен быть private-package чтобы здесь был доступ!
        double interest = balance * 0.05; // 5% годовых
        balance += interest;
        System.out.println("Проценты начислены: " + interest + ". Новый баланс: " + balance);
    }
}
