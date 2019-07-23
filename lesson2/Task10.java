package lesson2;

public class Task10 {
    public static void main(String[] args) {
        //Task 10. Write a Java program to find the maximum and minimum value of an array
        int[] array = {1, -4, 3, 28, 33, 6, 7, 31, 33, 2, -4};
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < (array.length); i++) {
            if (max < array[i]) {
                max = array[i];
            } else {
                max = max;
            }
        }
        System.out.println("Максимальное значение элементов массива: " + max);
        for (int i = 0; i < (array.length); i++) {
            if (min > array[i]) {
                min = array[i];
            } else {
                min = min;
            }
        }
        System.out.println("Минимальное значение элементов массива: " + min);
    }
}
