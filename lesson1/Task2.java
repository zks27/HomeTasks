package lesson1;

/*
2. Напишите метод, который будет увеличивать каждый элемент массива на 10%.
 */

public class Task2 {
    public static void main (String[] args){
       double [] array = {10,20,30,40,40,60};

        for(double arrayNew:array){
           double percent=arrayNew*1.1;
           System.out.println("Если увеличить " + arrayNew + " на 10%, получится " + percent);
        }
    }
}
