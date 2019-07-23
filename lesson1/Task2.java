package lesson1;

public class Task2 {
    public static void main (String[] args){
       double [] array = {10,20,30,40,50,60};

        for(double arraynew:array){
           double percent=arraynew*1.1;
           System.out.println("Если увеличить " + arraynew + " на 10%, получится " + percent);
        }
    }
}
