package Task_Bank;

public class Main {
    public static void main(String[] args) {

        //НЕ МОЖЕМ ВОТ ТАК СОЗДАТЬ АККАУН ИЗ АБСТРАКТНОГО КЛАССА
        //BankAccount bankAccount1 = new BankAccount("account_001", 0);
        //ПОЭТОМУ СОЗДАЕМ ВОТ ТАК, ИЗ НАСЛЕДНИКОВ
        SavingsAccount bankAccount2 = new SavingsAccount("SavingsAccount_002", 0);



        // Пополняем счет
        bankAccount2.deposit(500.0);
        // Снимаем средства
        bankAccount2.withdraw(200.0);
        // Рассчитываем проценты
        bankAccount2.calculateInterest();


        CheckingAccount bankAccount3 = new CheckingAccount("CheckingAccount_003", 0);
        // Пополняем счет
        bankAccount3.deposit(400.0);
        // Снимаем средства
        bankAccount3.withdraw(300.0);
        // Рассчитываем проценты
        bankAccount3.calculateInterest();


        System.out.println("**************************");
        // Массив объектов BankAccount на 2 счета
        BankAccount[] accounts = new BankAccount[2];

        // Создаем разные типы счетов для двух элементов массива
        accounts[0] = new SavingsAccount("Savings_001", 1000.0);
        accounts[1] = new CheckingAccount("Checking_002", 500.0);

        // Демонстрация полиморфизма
        for (BankAccount account : accounts) { //каждому из счетов
            account.deposit(300.0); //пополнение на 300
            account.withdraw(200.0); //снятие 200
            account.calculateInterest(); //начисление процентов
            System.out.println();
        }

    }
}
