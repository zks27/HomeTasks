package lesson1;

public class Task7 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 20; i < 201; ++i) {
            sum = sum + i;
        }
        System.out.println("Сумма цифр: " + sum);
    }
}
