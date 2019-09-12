package streamsHomeTask.textStatistics;

import java.io.File;

public abstract class Text {
    private Text next;



    public Text linkWith (Text next){
        this.next = next;
        return next;
    }

    public abstract boolean check (File file);

    protected boolean checkNext (File file){
        if (next == null){
            return true;
        }
        return next.check (file);
    }
}
