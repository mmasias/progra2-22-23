import java.util.ArrayList;
import java.util.List;

public class Option {
    private List<String> options;
    private int selectedOption;
    private int maxOptions;

    public Option(int maxOptions) {
        this.options = new ArrayList<String>();
        this.selectedOption = -1;
        this.maxOptions = maxOptions;
    }

    public void addOption(String option) {
        if (options.size() < maxOptions) {
            options.add(option);
        }
    }

    public String getOption(int index) {
        if (index >= 0 && index < options.size()) {
            return options.get(index);
        }
        return null;
    }

    public int getSelectedOption() {
        return selectedOption;
    }

    public void setSelectedOption(int selectedOption) {
        if (selectedOption >= 0 && selectedOption < options.size()) {
            this.selectedOption = selectedOption;
        }
    }
}