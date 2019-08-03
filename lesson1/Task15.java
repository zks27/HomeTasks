package lesson1;

/*
15. Выведете на экран все числа от 1 до 100 с помощью цикла (можно все три варианта в одной программе):
- for
- while
- do while
 */

public class Task15 {
    public static void main(String[] args) {
        int a = 1;
        int b = a;
        System.out.println("Цикл while:");
        while (a < 101) {
            System.out.println(a);
            a = ++a;
        }
        System.out.println("Цикл for:");
        for (a = 1; a < 101; a++) {
            System.out.println(a);
        }
        System.out.println("Цикл do while:");
        do {
            System.out.println(b);
            b = ++b;
        } while (b < 101);
    }
}
