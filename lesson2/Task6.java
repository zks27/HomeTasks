package lesson2;

public class Task6 {
    public static void main(String[] args) {
        //Task 6.  Write a Java program to find the index of an array element
        int[] array = {1, 2, 3, 4, 5, 9, 5, 8, 9};
        int index = 0;
        int element = 9;
        System.out.println("Индекс элемента " + element + ":");
        for (int i : array) {
            if (i == element) {
                System.out.println(index);
                index = index + 1;
            } else {
                index = index + 1;
            }
        }
    }
}
