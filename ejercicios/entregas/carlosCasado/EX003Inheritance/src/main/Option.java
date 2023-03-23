package main;

public class Option {

    private String options[];
    int selectedOption;
    int maxOptions;

    public Option() {
        this.maxOptions = 3;
        this.selectedOption = 0;
        this.options = new String[maxOptions];
    }

    public Option(int maxOptions) {
        this.maxOptions = maxOptions;
        this.selectedOption = 0;
        this.options = new String[maxOptions];
    }

    public void addOption(String option) {

        if (selectedOption < maxOptions) {
            options[selectedOption] = option;
            selectedOption++;
        }

    }

    public String getOption(int index) {
        return options[index];
    }

    public void setMaxOptions(int maxOptions) {
        this.maxOptions = maxOptions;
    }

    public int getMaxOptions() {
        return maxOptions;
    }

    public void selectOption(int index) {
        selectedOption = index;
    }

    public int getSelectedOption() {
        return selectedOption;
    }
}
