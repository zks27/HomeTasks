package lesson2;

public class Task8 {
    public static void main(String[] args) {
        //Task 8.  Write a Java program to copy an array by iterating the array
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
            System.out.println("Элемент нового массива с индексом " + i + " равен " + newArray[i]);
        }
    }
}
