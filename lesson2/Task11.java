package lesson2;

public class Task11 {
    public static void main(String[] args) {
        //Task 11. Write a Java program to reverse an array of integer values
        int[] array = {399, 2, 3, 4, 5, 6, 7, 8, 125};
        int[] newArray = new int[array.length];
        int k = 1;
        System.out.println("Элементы новго массива, реверсированного из исходного:");
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[array.length - k];
            k++;
            System.out.println("Элементом под индексом " + i + " является " + newArray[i]);
        }
    }
}
