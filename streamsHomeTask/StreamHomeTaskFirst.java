package streamsHomeTask;

/*
Создать и заполнить файл случайными целыми числами. Отсортировать содержимое файла по возрастанию.
По итогу получить файл с отсортированным массивом чисел
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class StreamHomeTaskFirst {
    public static void main(String[] args) {

        char[] unsortedArray = new char[10];
        char[] sortedArray = new char[unsortedArray.length];
        Random random = new Random();
        for (int i = 0; i < unsortedArray.length; i++) {
            unsortedArray[i] = (char) (random.nextInt(10));
        }


        try (FileWriter fw = new FileWriter("RANDOMNUMERALS.TXT")) {
            fw.write(unsortedArray);
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        }

        System.out.println("Сожержимое файла до сортировки:");


        try (FileReader fr = new FileReader("RANDOMNUMERALS.TXT")
        ) {
            int k;
            int j = 0;
            while ((k = fr.read()) != -1) {
                System.out.println(k);
                sortedArray[j] = (char) k;
                j++;
            }
            Arrays.sort(sortedArray);
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        }

        try (FileWriter fw = new FileWriter("RANDOMNUMERALS.TXT")
        ) {
            fw.write(sortedArray);
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        }

        System.out.println("Сожержимое файла после сортировки:");

        try (FileReader fr = new FileReader("RANDOMNUMERALS.TXT")
        ) {
            int k;
            while ((k = fr.read()) != -1) {
                System.out.println(k);
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        }
    }

}

