package streamsHomeTask.textStatistics;

import java.io.File;

public class FileCheck extends Text {

    @Override
    public boolean check(File file) {
        if (file.exists() && file.isFile()) {
            return checkNext(file);
        }
        return false;
    }
}
