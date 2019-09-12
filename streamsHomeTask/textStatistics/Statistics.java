package streamsHomeTask.textStatistics;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Statistics {

    public static void getStat(String fileName) {

        int paragraphQuantity = 0;
        int sentenceQuantity = 0;
        int wordQuantity = 0;
        String text = "";


        try (FileReader fr = new FileReader(fileName);
             Scanner con = new Scanner(fr)) {
            while (con.hasNextLine()) {
                text = text.concat(con.nextLine()) + '\n';
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        }


        System.out.println("Размещенный текст:");
        System.out.println(text);
        System.out.println();


        System.out.println("Текст, разбитый на абзацы:");
        Pattern patternParagraph = Pattern.compile("^(?:(?!^$)[\\s\\S])+$", Pattern.MULTILINE | Pattern.COMMENTS);
        Matcher matcherParagraph = patternParagraph.matcher(text);
        while (matcherParagraph.find()) {
            System.out.println(matcherParagraph.group());
            paragraphQuantity++;
        }
        System.out.println();

        System.out.println("Текст, разбитый на предложения:");
        Pattern patternSentence = Pattern.compile("[^.!?\\s][^.!?]*(?:[.!?](?!['\"]?\\s|$)[^.!?]*)*[.!?]?['\"]?(?=\\s|$)", Pattern.MULTILINE | Pattern.COMMENTS);
        Matcher matcherSentence = patternSentence.matcher(text);
        while (matcherSentence.find()) {
            System.out.println(matcherSentence.group());
            sentenceQuantity++;
        }
        System.out.println();

        System.out.println("Текст, разбитый на слова:");
        Pattern patternWord = Pattern.compile("\\w+", Pattern.MULTILINE | Pattern.COMMENTS);
        Matcher matcherWord = patternWord.matcher(text);
        while (matcherWord.find()) {
            System.out.println(matcherWord.group());
            wordQuantity++;
        }
        System.out.println();

        System.out.println("Количество абзацев: " + paragraphQuantity);
        System.out.println("Количество предложений: " + sentenceQuantity);
        System.out.println("Количество слов: " + wordQuantity);


    }
}
