package lesson1;

public class Task5 {
    public static void main(String[] args) {
        int number = 1;
        System.out.println("Список нечетных цифр;");
        do {
            int oddNumber = number % 2;
            if (oddNumber == 1) {
                System.out.println(number);
            }
            number = ++number;
        } while (number < 16);
    }
}
