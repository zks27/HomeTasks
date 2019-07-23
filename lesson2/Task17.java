package lesson2;

public class Task17 {
    public static void main(String[] args) {
        //Task 17. Write a Java program to find the second largest element in an array
        int[] array = {25, 2, 24, 4, 20, 6, 25};
        int max = array[0];
        int secondMax = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max <= array[i]) {
                max = array[i];
            } else {
                max = max;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (secondMax <= array[i] && array[i] != max) {
                secondMax = array[i];
            } else {
                if(secondMax==max){
                    secondMax=array[i+1];
                }else
                secondMax = secondMax;

            }
        }
        System.out.println("Второй по величине элемент массива - " + secondMax);
    }
}
