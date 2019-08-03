package lesson1;

/*
3. Напишите метод, который будет проверять является ли число палиндромом (одинаково читающееся в обоих направлениях).
 */

public class Task3 {
    public static void main(String[] args) {
        int number = 324;
        int fin = number;
        int c = 0;
        int reverse = 0;
        do {
            int g = number % 10;
            number = number / 10;
            c = number - 1;
            reverse = 10 * reverse + g;
        } while (c != -1);
        if (reverse == fin) {
            System.out.println("Число " + fin + " является палиндромом");
        } else {
            System.out.println("Число " + fin + " не является палиндромом");
        }


    }
}
