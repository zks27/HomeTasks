package otherTask;

/*Создайте структуру с именем student, содержащую поля: фамилия и инициалы, номер
группы, успеваемость (массив из пяти элементов). Создать массив из десяти элементов
такого типа, упорядочить записи по возрастанию среднего балла. Добавить возможность
вывода фамилий и номеров групп студентов, имеющих оценки, равные только 4 или 5.
 */

public class Student {
    public String name;
    public int groupNumber;
    public int perfomance[] = new int[5];

    Student(String name, int groupNumber, int perfomance[]) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.perfomance = perfomance;
    }

    @Override
    public String toString() {
        return "Имя = " + name  + "\n" +
                "Номер группы = " + groupNumber + "\n";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public void setPerfomance(int[] perfomance) {
        this.perfomance = perfomance;
    }

    public String getName() {
        return name;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int[] getPerfomance() {
        return perfomance;
    }

    double range() {
        double sum = 0;
        for (int i = 0; i < perfomance.length; i++) {
            sum = sum + perfomance[i];
        }
        return sum / perfomance.length;
    }

    boolean quality() {
        double k = 0;
        boolean b = true;
        for (int i = 0; i < perfomance.length; i++) {
            if (perfomance[i] < 4) k++;
        }
        if (k > 0) b = false;
        return b;
    }

}

class StudentDemo {
    public static void main(String[] args) {
        Student student[] = new Student[5];
        student[0] = new Student("Волков А.И.", 11, new int[]{5, 4, 4, 4, 5});
        student[1] = new Student("Зайцев В.А.", 10, new int[]{3, 4, 4, 4, 5});
        student[2] = new Student("Мишин В.П.", 11, new int[]{5, 5, 5, 5, 5});
        student[3] = new Student("Щавель В.У.", 12, new int[]{4, 4, 4, 4, 4});
        student[4] = new Student("Вапрок З.У.", 11, new int[]{5, 4, 4, 3, 3});
        for (int i = 0; i < student.length; i++) {
            for (int k = i + 1; k < student.length; k++) {
                if (student[i].range() >= student[k].range()) {
                    Student g = student[i];
                    student[i] = student[k];
                    student[k] = g;
                }
            }
        }

        System.out.println("Список студентов с оценками выше 3:");
        for (int i = 0; i < student.length; i++) {
            if (student[i].quality() == true) System.out.println(student[i].toString());
        }
    }
}
