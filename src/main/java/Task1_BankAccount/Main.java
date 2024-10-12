package Task1_BankAccount;

/**
 * Задача Банковский счет:
 * Создать класс BankAccount с полями для хранения номера счета и баланса.
 * Реализовать методы для получения (get) и установки (set) баланса
 * Создать интерфейс Printable с методом print(), который будет реализован в классе BankAccount для вывода баланса
 */

public class Main {

    public static void main(String[] args) {

        //создание экземпляра класса BankAccount
        BankAccount account1 = new BankAccount();

        //установим номер аккаунта через сеттер
        account1.setAccountNumber("1");
        //Установим баланс через сеттер баланса
        account1.setBalance(1000);

        //Получим имя и баланс акканта через метод в классе BankAccount
        account1.print();

        //пополнение баланса с выводом баланса после пополнения
        account1.refullment(500);

        //снятие денег с выводом баланса после снятия
        account1.recieve(300);


    }


}