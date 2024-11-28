package Task_Circle;

public class Circle {

    private int radius;

    //конструктор принимающий радиус
    public Circle(int radius) {
        this.radius = radius;
    }

    //Площадь круга
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    //Длина окружности
    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }


}
