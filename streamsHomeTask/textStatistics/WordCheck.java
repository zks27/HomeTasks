package streamsHomeTask.textStatistics;

import java.io.File;

public class WordCheck extends Text {

    @Override
    public boolean check(File file) {
        if (file.length() == 0) {
            return false;
        }
        return checkNext(file);
    }

}
