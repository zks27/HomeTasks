package lesson2;

public class Task13 {
    public static void main(String[] arg) {
        //Task 13. Write a Java program to find the duplicate values of an array of string values
        String[] array = {"кот", "пес", "корова", "щука", "пес", "корова", "корова"};
        int t = array.length;
        System.out.println("Список дубликатов:");
        for (int i = 0; i < t; i++) {
            for (int k = i + 1; k < t; k++) {
                if (array[i] == array[k]) {
                    System.out.println("- " + array[i]);
                    for (int h = k; h < t - 1; h++) {
                        array[h] = array[h + 1];
                    }
                    k--;
                    t--;
                }
            }
        }
    }
}
