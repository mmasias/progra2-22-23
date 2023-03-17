package Main;

public class Option {
    private String[] options;
    private int selectedOption;
    private int maxOptions;

    public Option(String[] options, int selectedOption, int maxOptions) {
        this.maxOptions = maxOptions;
        this.options = new String[maxOptions];
        this.selectedOption = 0;
    }

    public void addOption(String option) {
        if (this.selectedOption < this.maxOptions) {
            this.options[this.selectedOption] = option;
            this.selectedOption++;
        }
    }

    public String getOption(int index) {
        return this.options[index];
    }

    public void selectOption(int option) {
        this.selectedOption = option;
    }

    public String getSelectedOption() {
        return this.options[this.selectedOption];
    }


}
