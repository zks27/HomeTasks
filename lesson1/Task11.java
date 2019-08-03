package lesson1;

/*
11. Напишите программу с тремя переменными целого типа. Определить какое из них наибольшее.
 */

public class Task11 {
    public static void main(String[] args) {
        int a = 6;
        int b = 5;
        int c = 3;
        if (a > b && a > c) {
            System.out.println("Наибольшая переменная - a");
        } else {
            if (b > a && b > c) {
                System.out.println("Наибольшая переменная - b");
            } else {
                System.out.println("Наибольшая переменная - c");
            }
        }
    }
}
