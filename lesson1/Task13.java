package lesson1;

/*
13. Напишите программу, где двум строковым переменным присваиваются значения,
третей же строковой переменных присвойте объединение (конкатенацию) двух предыдущих строк.
Затем напечатайте значение третьей строковой переменной.
 */

public class Task13 {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World!";
        String c = a + " " + b;
        System.out.println(c);
    }
}
