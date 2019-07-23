package lesson2;

public class Task5 {
    public static void main(String[] args) {
        //Task 5.  Write a Java program to test if an array contains a specific value
        int[] array = {1, 2, 8, 4, 5, 6, 7, 8, 9};
        int spV = 3;
        int c = 0;
        for (int i : array) {
            if (i == spV) {
                c = c + 1;
            }
        }
        if (c > 0) {
            System.out.println("Массив содержит " + spV);
        } else {
            System.out.println("Массив не содержит " + spV);
        }
    }
}
