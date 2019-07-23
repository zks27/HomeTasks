package lesson2;

public class Task15 {
    public static void main(String[] args){
        //Task 15. Write a Java program to find the common elements between two arrays of integers
        int [] arrayFirst = {1,2,3,4,5,6};
        int [] arraySecond = {10,9,8,7,6,5};
        System.out.println("Список одинаковых элементов в 2-х массивах:");
        for (int i = 0; i<arrayFirst.length;i++){
            for(int k = 0;k<arraySecond.length;k++){
                if (arrayFirst[i]==arraySecond[k]){
                    System.out.println("- " + arrayFirst[i]);
                }
            }
        }

    }
}
