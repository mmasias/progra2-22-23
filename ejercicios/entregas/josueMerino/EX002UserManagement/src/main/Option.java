package main;

public class Option {
    private String[] options;
    private String selectedOption;
    int maxOptions;

    public Option(String[] options, int maxOptions)
    {
        this.options = options;
        this.selectedOption = null;
        this.maxOptions = maxOptions;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public String getSelectedOption() {
        for (String option: this.options) {
            if (option == this.selectedOption)
            {
                return option;
            }
        }
        return "No existe esa opción";
    }

    public void setSelectedOption(String selectedOption) {
        this.selectedOption = selectedOption;
    }

    public int getMaxOptions() {
        return maxOptions;
    }

    public void setMaxOptions(int maxOptions) {
        this.maxOptions = maxOptions;
    }


}
