package lesson1;

/*
1. Напишите программу, которая вычисляет ваш вес на Луне с учетом того, что сила тяжести равна 16% от силы тяжести на Земле.
 */

public class Task1 {
    public static void main(String[] args) {
        int m = 90;
        double moon = m * 0.16;
        System.out.println("Ваш вес на луне: " + moon + " кг");

    }
}
