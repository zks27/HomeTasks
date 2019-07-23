package lesson2;

public class Task2 {
    public static void main(String[] args) {
        //Task 2. Write a Java program to sum values of an array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 347};
        int sum = 0;
        for (int i : array) {
            sum = sum + i;
        }
        System.out.println("Сумма значений массива равна " + sum);
    }
}
