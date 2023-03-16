public class Option {
    private String optionList [];
    private int selectedOption;
    private int maxOptions = 20;

    public Option() {
        this.optionList = new String[maxOptions];
        this.selectedOption = 0;
    }

    public String[] getOptionList() {
        return optionList;
    }

    public void setOptionList(){
        this.optionList = optionList;
    }

    public int getSelectedOption() {
        return selectedOption;
    }
    private void setSelectedOption(int selectedOption) {
        this.selectedOption = selectedOption;
    }

    public int getMaxOptions() {
        return maxOptions;
    }
    private void setMaxOptions(int maxOptions) {
        this.maxOptions = maxOptions;
    }

    public void addOption(String options) {
        if (optionList.length < maxOptions) {
            optionList[optionList.length] = options;
        } else {
            System.out.println("No more options can be added");
        }
    }

    public String getOption(int index) {
        String returnedOption = "";
        for (int i = 0; i < maxOptions; i++) {
            if (i == index) {
                returnedOption = optionList[index];
            }
        }
        ;
        return returnedOption;
    }
}
