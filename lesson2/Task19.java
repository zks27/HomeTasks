package lesson2;

public class Task19 {
    public static void main(String[] args) {
        //Task 19. Write a Java program to add two matrices of the same size
        int[][] arrayFirst = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3},
        };
        int[][] arraySecond = {
                {2, 2, 2},
                {3, 3, 3},
                {4, 4, 4}
        };
        int[][] arraySum = new int[arrayFirst.length][arrayFirst[0].length];
        System.out.println("Итоговая матрица:");
        for (int i = 0; i < arrayFirst.length; i++) {
            for (int k = 0; k < arrayFirst[i].length; k++) {
                arraySum[i][k] = arrayFirst[i][k] + arraySecond[i][k];
                System.out.print(arraySum[i][k] + " ");
            }
            System.out.println();
        }
    }
}
