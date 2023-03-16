package Poo;

import java.util.Scanner;

public class Option {
    private Scanner scanOption = new Scanner(System.in);
    // array with the list of options
    private String[] optionList;
    // index of the selected option
    private int selectedOption;
    private static int maxOptions = 15;

    public Option () {
        this.optionList = new String[maxOptions];
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

    public static int getMaxOptions() {
        return maxOptions;
    }

    public static void setMaxOptions(int maxOptions) {
        Option.maxOptions = maxOptions;
    }

    /**
     * Adds options to the array.
     */
    public void addOptions () {
        for (int i = 0; i < maxOptions; i++) {
           this.optionList[i] = scanOption.nextLine();
           if (optionList[i].equals("stop")) {
               optionList[i] = null;
               break;
           }
        }
    }

    /**
     * Adds a certain option to the array.
     * @param option The option that we want to add.
     */
    public void addOption (String option) {
        if (selectedOption < maxOptions) {
            optionList[selectedOption] = option;
            selectedOption++;
        }
    }

    /**
     * Gets a certain option given an index.
     * @param index The index of the option we want to get.
     * @return The option we want to get.
     */
    public String getOption (int index) {
        String returnedOption = " ";
        for (int i = 0; i < maxOptions; i++) {
            if (optionList[i] == optionList[index]) {
                returnedOption = optionList[index];
            }
        }
        return returnedOption;
    }
}
