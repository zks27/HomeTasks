package lesson1;

/*
17. Все элементы массива поделить на значение наибольшего элемента этого массива.
 */

public class Task17 {
    public static void main(String[] args) {
        int[] arrayNew = {20, 40, 80, 200, 100, 100, 10, 20, 20};
        int max = 0;
        System.out.println("Элементы массива, поделенные на значение наибольшего элемента:");
        for (int i : arrayNew) {
            if (max >= i) {
                max = max;
            } else {
                max = i;
            }

        }
        for (double division : arrayNew) {
            division = division / max;
            System.out.println(division);
        }

    }
}
