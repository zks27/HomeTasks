package lesson2;

public class Task4 {
    public static void main(String[] args) {
        //Task 4.  Write a Java program to calculate the average value of array elements
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 20};
        double sum = 0;
        for (int i : array) {
            sum = sum + i;
        }
        double av = sum / array.length;
        System.out.println("Среднее значение элемента массива состовляет - " + av);
    }
}
