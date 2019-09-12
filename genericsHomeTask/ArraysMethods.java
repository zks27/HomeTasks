package genericsHomeTask;

public class ArraysMethods {
    public static void elementByIndex(int index, Source[] array) {

        if (index <= array.length && index >= 0) {

            System.out.println("Под индексом " + index + " находится элемент " + "`" + array[index].getData() + "`");
        } else {
            if (index < 0) {
                System.out.println("Индекс не может быть отрицательным числом. Укажите индекс в пределах: 0-" + array.length);
            } else {
                System.out.println("Элемента под индексом " + index + " нет, так как длина массива равна - " + array.length + ". Укажите индекс в пределах: 0-" + array.length);
            }
        }
    }
}
