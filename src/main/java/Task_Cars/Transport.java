package Task_Cars;

public abstract class Transport implements IRefueble {


    private String name;
    private String type; // "electro" || "DVS"

    public Transport(String name, String type) {
        this.name = name;
        this.type = type;
    }

    //зарядка и заправка машины зависит от типа машины и от уровня топлива

    //Абстрактный класс Транспорт (год,модель)

    //наследники
    //класс Car (уровень топлива %) - IRefueble заправляет
    //класс ElectroCar (уровень зарядки %) - IRefueble заряжает




    //интерфейс Зарядка/заправка с двумя видами зарядки IRefueble







}
