package main;

public class Option {

    private String[] options;
    private int selectedOption;
    private int maxOptions;

    public void addOption(String newOption) {
        int currentOption = 0;
        while (this.maxOptions > currentOption) {
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
        return options[this.selectedOption];
    }
}
