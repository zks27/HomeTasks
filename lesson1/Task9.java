package lesson1;

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
