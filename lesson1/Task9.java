package lesson1;

/*
9. Объявить 2 переменных целого типа. Необходимо поменять значения переменных так,
чтобы значение первой оказалось во второй, а второй - в первой.
 */

public class Task9 {
    public static void main(String[] args) {
        int a = 7;
        int b = 21;
        System.out.println("Переменная a = " + a);
        System.out.println("Переменная b = " + b);
        System.out.println("После изменения значений:");
        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println("Переменная a = " + a);
        System.out.println("Переменная b = " + b);
    }
}
