package main;
public class Options {
    private String[] options;
    private int selectedOption;
    private int maxOptions;

    public Options(int maxOptions) {
        this.maxOptions = maxOptions;
        this.options = new String[maxOptions];
    }

    public void addOption(String option) {
        if (selectedOption < maxOptions) {
            options[selectedOption++] = option;
        }
    }

    public String getOption(int index) {
        return options[index];
    }

    public void selectOption(int index) {
        if (index >= 0 && index < maxOptions) {
            selectedOption = index;
        }
    }

    public String getSelectedOption() {
        return options[selectedOption];
    }
}

