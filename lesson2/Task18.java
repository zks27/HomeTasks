package lesson2;

public class Task18 {
    public static void main(String[] args) {
        int[] array = {1, 1, 24, 4, 20, 6, 25, 1};
        int min = array[0];
        int secondMin = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min >= array[i]) {
                min = array[i];
            } else {
                min = min;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (secondMin >= array[i] && array[i] != min) {
                secondMin = array[i];
            } else {
                if (secondMin == min) {
                    secondMin = array[i + 1];
                } else {
                    secondMin = secondMin;

                }
            }
        }
        System.out.println("Второй по величине элемент массива c конца - " + secondMin);
    }
}
