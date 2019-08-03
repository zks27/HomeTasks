package lesson1;

/*
18. Напишите метод переводящий рубли в доллары по заданному курсу. В качестве аргументов укажите кол-во рублей и курс.
 */

public class Task18 {
    public static void main(String[] args) {
        double rate = 0.49;
        double rub = 1000;
        double dollar = rub * rate;
        System.out.println(rub + " RUB " + "= " + dollar + " USD");
    }
}
