package src.main;

public class Option {
    // Attributes
    private String[] options;
    private final int selectedOption;
    private int maxOptions;
    private int filledOptions;

    // Constructor
    public Option(int maxOptions) {
        this.options = new String[maxOptions];
        this.selectedOption = 0;
        this.maxOptions = maxOptions;
        this.filledOptions = 0;
    }
    public Option(String[] options, int selectedOption, int maxOptions) {
        this.options = options;
        this.selectedOption = selectedOption;
        this.maxOptions = maxOptions;
        this.filledOptions = 0;
    }
    public void addOption(String option) {
        if (filledOptions < maxOptions) {
            options[filledOptions] = option;
            filledOptions++;
        }
    }
    public String getOption(int index){
        return options[index];
    }
}
