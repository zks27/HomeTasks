package lesson2;

public class Task7 {
    public static void main(String[] args) {
        //Task 7.  Write a Java program to remove a specific element from an array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 5, 5};
        int index = 0;
        int element = 5;
        int b = 0;
        System.out.println("Массив, после того, как удалили элемент " + element + ":");
        for (int i : array) {
            if (i == element) {
                b = b + 1;
            }
        }
        int[] newArray = new int[array.length - b];
        for (int r : array) {
            if (r != element) {
                newArray[index] = r;
                index = index + 1;
            } else {
                index = index;
            }
        }
        for (int p : newArray) {
            System.out.println(p);
        }
    }

}
