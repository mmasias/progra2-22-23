public class Option {
    private String optionList [];
    private int selectedOption;
    private int maxOptions;

    public Option() {
        this.optionList = new String[maxOptions];
        this.selectedOption = 0;
        this.maxOptions = maxOptions;
    }

    public void addOption(String options) {
        if (optionList.length < maxOptions) {
            optionList[optionList.length] = options;
        } else {
            System.out.println("No more options can be added");
        }
    }

    public String getOptions() {
        return options;
    }

    private void setSelectedOption(int selectedOption) {
        if (selectedOption > 0 && selectedOption < optionList.length) {
            this.selectedOption = selectedOption;
        } else {
            System.out.println("Invalid option");
        }
    }

    public String getSelectedOption() {
        return optionList[selectedOption];
    }

}
