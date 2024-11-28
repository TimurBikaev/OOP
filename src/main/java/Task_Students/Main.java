package Task_Students;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Ivan", 1, 4.0);
        Student student3 = new Student("Peter", 2, 5.0);
        Student student4 = new Student("Vasil", 2, 3.0); // должен не пройти при создании

        //Добавляются все студенты независимо от equals или hashCode, так как ArrayList не проверяет дубликаты
        List<Student> studentList  = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        //вывод всего списка
        System.out.println(studentList);
        //вывод студентов из списка
        for (Student student : studentList) {
            System.out.println(student);
        }

        //HashSet использует equals и hashCode для проверки уникальности. Если equals сравнивает только id, то Vasil заменит Peter:
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);

        System.out.println("\nHashSet:");
        for (Student student : studentSet) {
            System.out.println(student);
        }

        // Клонирование
        Student copy = student2.clone();

        // Вывод объектов
        System.out.println("Оригинал: " + student2);
        System.out.println("Копия: " + copy);


//        System.out.println(student1.toString());
//        System.out.println(student2.toString());
//        System.out.println(student3.toString());
//        System.out.println(student4.toString());

    }





}
