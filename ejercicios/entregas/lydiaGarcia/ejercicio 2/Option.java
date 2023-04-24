public class Option {
    private String[] optionList;
    private int selectedOption;
    private int maxOptions;

    public Option(int maxOptions, String[] options, int i) {
        this.maxOptions = maxOptions;
        this.selectedOption = i;
        this.optionList = new String[maxOptions];
    }

    public String[] getOptionList() {
        return optionList;
    }

    public void setOptionList(String[] optionList) {
        this.optionList = optionList;
    }

    public int getSelectedOption() {
        return selectedOption;
    }

    public void setSelectedOption(int selectedOption) {
        this.selectedOption = selectedOption;
    }

    public int getMaxOptions() {
        return maxOptions;
    }

    public void setMaxOptions(int maxOptions) {
        this.maxOptions = maxOptions;
    }

    public void add(String option){
        if (selectedOption < maxOptions ){
            this.optionList[selectedOption] = option;
            selectedOption++;
        }
    }

    public void showMenu(){
        for (int i = 0; i < selectedOption; i++) {
            System.out.println(optionList[i]);
        }
    }

    public String showOption(int optChoosen) {
        String temp = "";
        if (optChoosen < selectedOption) {
            String[] option;
            temp = optionList[optChoosen];
        }
        return temp;
    }


}
