package lesson1;

public class Task11 {
    public static void main(String[] args) {
        int a = 4;
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
