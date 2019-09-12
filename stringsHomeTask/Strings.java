package stringsHomeTask;

/*
1. Получить уникальные строки
2. Вывести строки длиной больше 10
3. Вывести получаемую строку в upperCAse and LowerCase
4. Дан массив 1, 2, 3, 4, 5, 6, 2, 3
подсчитать количество вхождений каждого элемента массива и вывести элемент с максимальным вхождением
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Strings {

    public static void main(String[] args) {
        List<String> listForStreams = Arrays.asList("a1", "a2", "a2", "a3");

        listForStreams.stream();

        System.out.println("Уникальные строки:");
        listForStreams.stream().distinct().peek((e) -> System.out.print(" " + e)).collect(Collectors.toList());
        System.out.println();
        System.out.println();

        System.out.println("Строки длиной больше 10:");
        listForStreams.stream().filter((p) -> p.length() > 10).peek((e) -> System.out.print(" " + e)).collect(Collectors.toList());
        System.out.println();
        System.out.println();

        System.out.println("Получаемая строка в upperCAse and LowerCase:");
        listForStreams.stream().distinct().map(String::toUpperCase).peek((e) -> System.out.print(" " + e)).collect(Collectors.toList());
        System.out.println();
        listForStreams.stream().distinct().map(String::toLowerCase).peek((e) -> System.out.print(" " + e)).collect(Collectors.toList());
        System.out.println();
        System.out.println();

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 2, 3};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int g = 0;
            for (int k = 0; k < array.length; k++) {
                if (array[k] == array[i]) {
                    g++;
                }
                hm.put(array[i], g);
            }
        }

        System.out.println("Количество вхождений каждого элемента в массив {1, 2, 3, 4, 5, 6, 2, 3}:");
        System.out.println(hm.entrySet());
        System.out.println();

        Integer max = hm.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getValue();
        List listOfMax = hm.entrySet().stream().filter(entry -> entry.getValue() == max).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("Элемент(ы) с максимальным вхождением:");
        System.out.println(listOfMax);


    }
}
