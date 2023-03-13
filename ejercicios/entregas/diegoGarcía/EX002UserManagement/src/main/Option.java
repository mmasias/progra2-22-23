package main;

public class Option {
    int selectedOption;
    private int maxNumberOfOptions = 3;
    private String[] optionList = new String[maxNumberOfOptions];


    public Option(int selectedOption) {
        this.selectedOption = selectedOption;
    }

    public int getMaxNumberOfOptions() {
        return maxNumberOfOptions;
    }

    public void showOptions() {
        for (int i = 0; i < optionList.length; i++) {
            System.out.println(optionList[i]);
        }
    }

    public int getSelectedOption() {
        return selectedOption;
    }

    public void setSelectedOption(int selectedOption) {
        this.selectedOption = selectedOption;
    }





}
