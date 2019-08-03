package lesson1;

/*
6. Вывести на  экран все четные цифры от 1 до 100 не используя остаток от деления (используя только цикл for)
 */

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Список четных чисел:");
        for (int evNumber = 0; evNumber < 101; evNumber += 2) {
            System.out.println(evNumber);
        }
    }
}
