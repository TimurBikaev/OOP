package Task_Circle;

/**
 * Задача 1: Создание класса "Круг"
 * Создайте класс Circle, который будет описывать круг с помощью следующих свойств и методов:
 * Поле radius (радиус круга).
 * Конструктор, который принимает радиус круга.
 * Метод getArea(), возвращающий площадь круга (π * r^2).
 * Метод getCircumference(), возвращающий длину окружности (2 * π * r).
 */

public class Main {
    public static void main(String[] args) {

        //создание экземпляра круга с радиусом
        Circle circle = new Circle(5);
        System.out.println();
        System.out.println("Площадь: " + circle.getArea());
        System.out.println("Длина окружности: " + circle.getCircumference());

    }
}
