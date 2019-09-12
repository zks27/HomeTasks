package streamsHomeTask.textStatistics;

import java.io.File;

public class Check {
    private Text text;

    public void setText(Text text) {
        this.text = text;
    }

    public boolean checkFile(File file) {
        if (text.check(file)) {
            return true;
        }
        System.out.println("Получение статистики невозможно");
        return false;
    }
}
