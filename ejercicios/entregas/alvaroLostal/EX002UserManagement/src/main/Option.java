package main;
import java.util.ArrayList;
public class Option {
    private ArrayList<String> options;
    private String selectedOption;
    private int maxOptions;

    public Option(int maxOptions) {
        this.options = new ArrayList<String>();
        this.selectedOption = null;
        this.maxOptions = maxOptions;
    }

    public void addOption(String option) {
        if (options.size() < maxOptions) {
            options.add(option);
        } else {
            System.out.println("Error: Reached maximum number of options.");
        }
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void setSelectedOption(String option) {
        int optionIndex = options.indexOf(option);
        if (optionIndex >= 0 && optionIndex < options.size()) {
            selectedOption = options.get(optionIndex);
        }else {
            System.out.println("Error: Invalid option selected.");
        }
    }


    public String getSelectedOption() {
        return selectedOption;
    }
}