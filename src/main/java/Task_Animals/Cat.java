package Task_Animals;

public class Cat extends Animal implements Voice {

    public Cat() {
        setType("cat");
    }

    @Override
    public void voice() {

        System.out.println("Meow! Meow!");

    }

    @Override
    public void wantEat() {
        System.out.println("Me! Me!");
    }
}
