import java.util.ArrayList;
import java.util.List;

public class Options {

    List<String> options = new ArrayList<>();

    int nOptions;

    int optionFree;

    public Options(int nO) {
        nOptions=nO;
        optionFree=0;

    }

    public Options() {

    }

    public void addOption(String op) {
        if(options.size() < nOptions){
            options.add(op);
        }
    }


    public List<String> getOptions() {return this.options;}
}