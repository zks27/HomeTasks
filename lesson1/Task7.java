package lesson1;

/*
7. Посчитать сумму цифр от 20 до 200 и результат вывести на экран (используя цикл for)
 */

public class Task7 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 20; i < 201; ++i) {
            sum = sum + i;
        }
        System.out.println("Сумма цифр: " + sum);
    }
}
