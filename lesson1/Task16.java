package lesson1;

/*
16. Вывести на экран ряд натуральных чисел от минимума до максимума с шагом. Например, если минимум 10, максимум 35, шаг 5,
то вывод должен быть таким: 10 15 20 25 30 35. Минимум, максимум и шаг указываются пользователем (можно захардкодить).
 */

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
