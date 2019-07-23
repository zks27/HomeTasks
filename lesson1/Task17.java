package lesson1;

public class Task17 {
    public static void main(String[] args) {
        int[] arrayNew = {20, 40, 80, 100, 100, 100, 10, 20, 20};
        int max = 0;
        System.out.println("Элементы массива, поделенные на значение наибольшего элемента:");
        for (int i : arrayNew) {
            int b = i;
            if (max >= b) {
                max = max;
            } else {
                max = b;
            }

        }
        for (double division : arrayNew) {
            division = division / max;
            System.out.println(division);
        }

    }
}
