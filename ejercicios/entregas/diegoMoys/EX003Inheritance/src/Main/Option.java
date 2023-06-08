package Main;

public class Option {
    private String options[];
    private int selectedOption;
    private int maxOptions;

    private int size;

    public Option() {
        this.maxOptions = 10;
        this.size = 0;
        this.selectedOption = 0;
        this.options = new String[maxOptions];
    }

    public Option(int capacity) {
        this.maxOptions = capacity;
        this.size = 0;
        this.selectedOption = 0;
        this.options = new String[capacity];
    }

    public Option(String description) {
        options = new String[maxOptions];
        options[0] = description;
    }

    public void addOption(String option) {
            options[maxOptions] = option;
            maxOptions++;
    }

    public String getOption(int index) {

        if (index < 0 || index >= maxOptions) {
            return null;
        }

        return options[index];
    }

    public int getSelectedOption() {
        return selectedOption;
    }
}
