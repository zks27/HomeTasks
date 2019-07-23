package lesson2;

public class Task1 {
    //Task 1. Write a Java program to sort a numeric array and a string array
    public static void main(String[] args) {
        int[] arrayInt = {25, 5, 6, 7, 8, 2, 345, 5};
        String[] arrayStr = {"Кот", "Кот", "Пес", "Корова", "Медведь", "Аист", "Щука"};
        System.out.println("Отсортированный массив (начиная с большего):");
        for (int i = 0; i < arrayInt.length; i++) {
            for (int k = i + 1; k < arrayInt.length; k++) {
                if (arrayInt[i] <= arrayInt[k]) {
                    int g = arrayInt[i];
                    arrayInt[i] = arrayInt[k];
                    arrayInt[k] = g;
                }
            }
            System.out.println("- " + arrayInt[i]);
        }
    }
}
