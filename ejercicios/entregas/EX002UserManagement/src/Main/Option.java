package Main;

public class Option {

    public String[] optionList;
    public int selectedOption;
    public int maxOptions;

    public Option(String[] optionList, int selectedOption, int maxOptions) {
        this.optionList = new String[maxOptions];
        this.selectedOption = 0;
        this.maxOptions = maxOptions;
    }

    public Option(int selectedOption) {
        this.selectedOption = selectedOption;
        this.selectedOption = 0;
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
        if (selectedOption < maxOptions){
            optionList [selectedOption] = option;
            selectedOption++;
        }
    }
    public void showOptions(String option){
        for (int i = 0; i < selectedOption; i++) {
            System.out.println(optionList[i]);

        }
    }
    public String oneOption(int n){
        String aux = "";
        if (n<selectedOption){
            aux = optionList[n];
        }
        return aux;
    }

    public void setOptionList(int i) {
    }
}

