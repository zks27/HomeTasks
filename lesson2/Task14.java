package lesson2;

public class Task14 {
    public static void main(String[] args){
        //Task 14. Write a Java program to find the common elements between two arrays (string values)
        String [] arrayFirst = {"Один","Два","Три","Четыре","Пять","Шесть","Семь","Девять"};
        String [] arraySecond = {"Девять","Десять","Один","Два","Пять"};
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
