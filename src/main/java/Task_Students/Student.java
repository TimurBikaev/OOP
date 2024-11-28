package Task_Students;

import java.util.Objects;

public class Student implements Cloneable { //имплементация Cloneable для возможности клонирования

    private String name;
    private int id;
    private double gpa;

    public Student() {
    }


    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gpa=" + gpa +
                '}';
    }


        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || o.getClass() != this.getClass()) return false;
//        Student student = (Student) o;
//        return id == student.id;
//    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }



    // Метод clone для глубокой копии
    @Override
    protected Student clone() {
        try {
            return (Student) super.clone(); // Поверхностное клонирование
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Никогда не случается, так как мы поддерживаем Cloneable
        }
    }
}
