package main;

public class Option {
    private String[] options;
    private int selectedOption;
    private int maxOptions;
    private int size;
    
    public Option() {
        this.maxOptions = 10;
        this.size = 0;
        options = new String[maxOptions];
    }
    public Option(int maxOptions) {
        this.maxOptions = maxOptions;
        this.size = 0;
        options = new String[maxOptions];
    }
    public void addOption(String option) {
        if (size < maxOptions) {
            options[size] = option;
            size++;
        }
    }
    public String getOption(int index) {
        return options[index];
    }

    public void selectOption(int index) {
        selectedOption = index;
    }

    public int getSelectedOption() {
        return selectedOption;
    }

    public int getSize() {
        return size;
    }
}
