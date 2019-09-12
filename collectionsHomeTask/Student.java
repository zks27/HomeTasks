package collectionsHomeTask;

/*
4. Создать экземпляр класса TreeSet, поместить в него объекты класса Student(надо его спроектировать).
Вывести на экран информацию о каждом чётном в списке студенте, каждого нечётного студента удалить из коллекции.
 */

import java.util.*;

public class Student {
    private String firstName;
    private String secondName;
    private int groupNumber;

    Student() {

    }

    private Student(String firstName, String secondName, int groupNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.groupNumber = groupNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return groupNumber == student.groupNumber &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(secondName, student.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, groupNumber);
    }

    @Override
    public String toString() {
        return
                firstName +
                        " " + secondName +
                        " - " + groupNumber + " группа";
    }


    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>(Comparator.comparing(Student::getSecondName));
        Student student1 = new Student("Иван", "Иванов", 10);
        Student student2 = new Student("Андрей", "Андреев", 10);
        Student student3 = new Student("Михаил", "Михайлов", 10);
        Student student4 = new Student("Семен", "Семенов", 11);
        Student student5 = new Student("Кирилл", "Кириллов", 11);
        Student student6 = new Student("Евгения", "Олеговна", 11);
        Student student7 = new Student("Александра", "Александрова", 12);
        Student student8 = new Student("Василиса", "Петровна", 12);
        Student student9 = new Student("Елизавета", "Фомина", 12);
        Student student10 = new Student("Анастасия", "Корвина", 12);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);

        System.out.println("Список студентов:");
        Iterator<Student> i = students.iterator();
        int number = 1;
        while (i.hasNext()) {
            System.out.println(number + ". " + i.next());
            number++;
        }

        System.out.println();



        System.out.println("Список студентов, у которых четный номер в списке:");
        Iterator<Student> k = students.iterator();
        number = 1;
        while (k.hasNext()) {
            Student o = k.next();
            if (number%2 == 0){
                System.out.println(number + ". " + o);
            }else {
                k.remove();
            }
            number ++;
        }

    }
}
