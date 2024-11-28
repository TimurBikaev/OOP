package Task_Item;

public class Main {
    public static void main(String[] args) {

        Item item1 = new Item("Холодильник", 50000, 3);

        System.out.println(item1.getInfo());

        item1.restock(3);

        System.out.println(item1.getInfo());

        item1.sell(6);

        System.out.println(item1.getInfo());

    }
}
