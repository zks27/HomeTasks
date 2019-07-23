package lesson1;

public class Task16 {
    public static void main(String[] args) {
        int min = -7;
        int max = 54;
        int step = 10;
        System.out.println("Список натуральных чисел от " + min + " до " + max + " c шагом " + step + ":");
        for (min = min; min <= max; min += step) {
            if (min > 0) {
                System.out.println(min);
            }
        }
    }
}
