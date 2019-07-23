package lesson2;

public class Task9 {
    public static void main(String[] args) {
        //Task 9.  Write a Java program to insert an element (specific position) into an array
        int element = 25;
        int index = 2;
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
            System.out.println("Элемент нового массива с индексом " + i + " равен " + newArray[i]);
        }
        newArray[index] = element;
        System.out.println("Элемент нового массива с индексом " + index + " равен " + newArray[index]);
        for (int i = index; i < array.length; i++) {
            newArray[i + 1] = array[i];
            System.out.println("Элемент нового массива с индексом " + (i + 1) + " равен " + newArray[i + 1]);
        }
    }
}