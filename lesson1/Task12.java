package lesson1;

/*
12. Напишите программу, в которой используются две переменные логического типа (boolean),
присвойте им значения и выведете для каждой переменной на экран строку "истина",
если переменная имеет значение true и "ложь", если переменная имеет значение false.
 */

public class Task12 {
    public static void main(String[] args) {
        int a = 4;
        int b = 37;
        boolean big = a > b;
        boolean small = b > a;
        if (big) {
            System.out.println("a>b - Истина");
        } else {
            System.out.println("a>b - Ложь");
        }
        if (small) {
            System.out.println("b>a - Истина");
        } else {
            System.out.println("b>a - Ложь");
        }
    }
}
