package main;

public class Option {

    protected String[] options;
    protected int selectedOption;
    protected int maxOptions;

    public Option(String[] options, int selectedOption, int maxOptions) {
        this.options = options;
        this.selectedOption = selectedOption;
        this.maxOptions = maxOptions;
    }

    public void addOption(String newOption) {
        int currentOption = 0;
        while (maxOptions > currentOption) {
            options[currentOption] = newOption;
            currentOption++;
        }
    }

    public String getOption(int index) {
        return options[index];
    }

    public void selectOption(int index) {
        this.selectedOption = index;
    }

    public String getSelectedOption() {
        return options[selectedOption];
    }

}
