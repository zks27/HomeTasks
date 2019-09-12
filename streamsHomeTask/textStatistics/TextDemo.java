package streamsHomeTask.textStatistics;

/*
Разместить в файле любой текст, разбить его на абзацы, предложения, слова, вывести статистику по тексту.
Ко всему этому использовать паттерн Chain of Responsibilities.
 */

import java.io.File;

public class TextDemo {


    public static void main(String[] args) {
        String fileName = "TEXT.TXT";
        File file = new File(fileName);
        Statistics newStat = new Statistics();
        Check newCheck = new Check();

        Text text = new FileCheck();
        text.linkWith(new WordCheck());
        newCheck.setText(text);
        if (newCheck.checkFile(file)){
            newStat.getStat(fileName);
        }

    }

}
