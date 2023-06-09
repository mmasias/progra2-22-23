package Poo;

public class Option {
    private String[] options;
    private String selectedOption;

    public Option(String[] options, int i) {
        this.options = options;
        this.selectedOption = null;
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

}
