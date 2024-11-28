package Task_Animals;

public class Main {

    public static void main(String[] args) {

        Animal cat1 = new Cat();
        Animal dog1 = new Dog();
        Dog dog2 = new Dog("Cezar", 8);

        System.out.println();
        System.out.println(cat1.toString());
        System.out.println();
        System.out.println(dog1.toString());
        System.out.println();
        System.out.println(dog2.toString());

        dog2.fetch();
    }
}
