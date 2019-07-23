package lesson2;

public class Task12 {
    //Task 12. Write a Java program to find the duplicate values of an array of integer values.
    public static void main(String[] args) {
        int[] array = {3, 2, 3, 4, 5, 3, 7, 7, 7};
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
