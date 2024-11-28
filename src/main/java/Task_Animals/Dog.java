package Task_Animals;

public class Dog extends Animal implements Voice {

    //конструктор устанавливающий тип Собака при создании Собаки
    public Dog(){
        setType("dog");
    }

    //конструктор устанавливающий автоматически тип Собака и имя+возраст через аргументы
    public Dog(String name, int age){
        setName(name);
        setAge(age);
        setType("dog");
    }

    @Override
    public void wantEat() {
        System.out.println();
        System.out.println("Wow! Wow!");
    }

    @Override
    public void voice() {
        System.out.println();
        System.out.println("Bark! Bark!");

    }

    public void fetch(){
        System.out.println("Собака приносит палку");
    }
}
