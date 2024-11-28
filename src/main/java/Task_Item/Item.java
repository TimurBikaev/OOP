package Task_Item;

/**
 * Задача 3: Класс для представления единицы товара
 * Описание:
 * Создайте класс Item, который будет представлять товар.
 * Класс должен содержать:
 * Поля:
 * Название товара (name).
 * Цена товара (price).
 * Количество на складе (quantity).
 * Методы:
 * sell(int amount): уменьшает количество на складе на заданное значение, если достаточно товара.
 * restock(int amount): добавляет указанное количество на склад.
 * getInfo(): возвращает строку с информацией о товаре.
 */

public class Item {

    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void sell(int amount) {
        if (amount <= this.quantity) {
            this.quantity = this.quantity - amount;
        }
    }

    public void restock(int amount) {
            this.quantity = this.quantity + amount;
    }

    public String getInfo(){
        String info = "На складе " + quantity + " единиц товара " + name;
        return info;
    }


}
