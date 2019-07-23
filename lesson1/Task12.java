package lesson1;

public class Task12 {
    public static void main(String[] args) {
        int a = 4;
        int b = 37;
        boolean big = a > b;
        boolean small = b > a;
        if (big) {
            System.out.println("a>b - Истина");
        } else {
            System.out.println("a>b - Ложь");
        }
        if (small) {
            System.out.println("b>a - Истина");
        } else {
            System.out.println("b>a - Ложь");
        }
    }
}
