package lesson1;

/*
Напишите программу, которая будет считать количество часов, минут и секунд в n-ном количестве суток.
 */

public class Task20Adv {
    public static void main(String[] arg) {
        int n = 2;
        int h = n * 24;
        int m = h * 60;
        int s = m * 60;
        System.out.println("В " + n + " сутках " + h + " часов, " + m + " минут, " + s + " секунд");
    }
}
