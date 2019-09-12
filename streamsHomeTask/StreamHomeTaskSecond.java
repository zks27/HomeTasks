package streamsHomeTask;

//Прочитать строки из файла и поменять местами первое и последнее слова в каждой строк.

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StreamHomeTaskSecond {

    public static void main(String[] args) {

        List<String> newList = new LinkedList<>();
        System.out.println("До изменений:");


        try (FileReader fr = new FileReader("CHANGED.TXT");
             Scanner con = new Scanner(fr)
        ) {
            while (con.hasNextLine()) {
                String s = con.nextLine();
                String b = "";
                System.out.println(s);

                String[] stringArray = s.split(" ");
                String lam = stringArray[0];
                String lam2 = stringArray[stringArray.length - 1];
                stringArray[0] = lam2;
                stringArray[stringArray.length - 1] = lam;

                for (int i = 0; i < stringArray.length; i++) {
                    b = b.concat(stringArray[i] + " ");
                }
                newList.add(b);
            }


        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        }

        System.out.println();
        System.out.println("После изменений:");

        try (FileWriter fw = new FileWriter("CHANGED.TXT")) {
            for (int i = 0; i < newList.size(); i++) {
                fw.write(newList.get(i) + '\n');
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        }

        try (FileReader fr = new FileReader("CHANGED.TXT");
             Scanner con = new Scanner(fr)) {
            while (con.hasNextLine()) {
                String s = con.nextLine();
                System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        }


    }
}
