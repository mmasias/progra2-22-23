import java.util.ArrayList;
import java.util.List;

public class Option {
    public List<String> options;
    private int selection;
    private int maxopt;
    public Option(int maxopt){
        this.options=new ArrayList<String>();
        this.maxopt=maxopt;
        this.selection=0;
    }

    public String OptionOnIndex(int i){
        if (options.get(i)!= null) {
            return options.get(i);
        }
        return null;
    }
    public void addOption(String aux){
        if(options.size()<maxopt){
            options.add(aux);
        }
    }

    public void setSelection(int selection) {
        this.selection = selection;
    }

    public void setMaxopt(int maxopt) {
        this.maxopt = maxopt;
    }

    public int getSelection() {
        return selection;
    }

    public int getMaxopt() {
        return maxopt;
    }
}
