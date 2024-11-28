package Task_Cars;

public class Car extends Transport {

    private double levelFuel;
    private boolean isEngineOn;

    //инициализируем поля из родителя
    public Car(String name, String type) {
        super(name, type); //метод из супер-класса родителя
        this.levelFuel = 0;
    }

    public void turnOnOffEngine(boolean state) {
        this.isEngineOn = state;
    }

    public Car(String name, String type, double levelFuel, boolean isEngineOn) {
        super(name, type);
        this.levelFuel = levelFuel;
        this.isEngineOn = isEngineOn;
    }

    @Override
    public boolean refuel() {
        this.levelFuel = this.levelFuel + 1;
        return true;
    }
}
