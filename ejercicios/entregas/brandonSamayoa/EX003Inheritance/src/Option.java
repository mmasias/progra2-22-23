import java.util.ArrayList;

public class Option {
    private ArrayList<String> options;
    private int selectedOption;
    private int maxOptions;

    public Option(int maxOptions) {
        options = new ArrayList<String>();
        selectedOption = -1;
        this.maxOptions = maxOptions;
    }

    public void addOption(String option) {
        if (options.size() < maxOptions) {
            options.add(option);
        }
    }

    public String getOption(int index) {
        return options.get(index);
    }

    public void selectOption(int index) {
        selectedOption = index;
    }

    public String getSelectedOption() {
        if (selectedOption >= 0 && selectedOption < options.size()) {
            return options.get(selectedOption);
        } else {
            return "";
        }
    }
}
