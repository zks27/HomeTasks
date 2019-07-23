package lesson2;

public class Task16 {
    //Task 16. Write a Java program to remove duplicate elements from an array.
    public static void main(String[] arg) {
        int[] array = {1, 2, 3, 3, 3, 5, 7, 8, 9, 5, 5};
        int t = array.length;
        System.out.println("Элементы измененного массива:");
        for (int i = 0; i < t; i++) {
            for (int k = i + 1; k < t; k++) {
                if (array[i] == array[k]) {
                    for (int h = k; h < t - 1; h++) {
                        array[h] = array[h + 1];
                    }
                    k--;
                    t--;
                }
            }
        }
        int[] newArray = new int[t];
        for (int i = 0; i < t; i++) {
            for (int k = i + 1; k < t; k++) {
                if (array[i] == array[k]) {
                    for (int h = k; h < t - 1; h++) {
                        array[h] = array[h + 1];
                    }
                    k--;
                    t--;
                }
            }
            newArray[i] = array[i];
            System.out.println("Элемент измененного массива (без дубликатов) с индексом " + i + " равен " + newArray[i]);


        }

    }
}
