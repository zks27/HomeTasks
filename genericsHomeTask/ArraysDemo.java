package genericsHomeTask;

/*
Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).
Реализовать метод, который возвращает любой элемент массива по индексу.
 */

public class ArraysDemo {

    public static void main(String[] args) {


        Source[] newArray;
        newArray = new Source[]{new Source<>(10), new Source<>("Элемент"), new Source<>(2000), new Source<>(10.00), new Source<>("Новый элемент"),};
        ArraysMethods.elementByIndex(1, newArray);


    }

}
