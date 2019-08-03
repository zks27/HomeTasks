package lesson1;

/*
4. Вывести на экран все четные цифры от 1 до 100 (используйте остаток от деления)
 */

public class Task4 {
    public static void main(String[] args) {
        int number = 0;
        System.out.println("Список четных чисел:");
        do {
            int evNumber = number % 2;
            if (evNumber == 0) {
                System.out.println(number);
            }
            number = ++number;
        } while (number < 101);
    }
}
