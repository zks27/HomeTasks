package lesson1;

public class Task4 {
    public static void main(String[] args) {
        int number = 1;
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
