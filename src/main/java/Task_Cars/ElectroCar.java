package Task_Cars;

public class ElectroCar extends Transport {
    public ElectroCar(String name, String type) {
        super(name, type);
    }

    @Override
    public boolean refuel() {
        return false;
    }
}
