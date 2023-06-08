package PortalWeb;

import java.util.ArrayList;
import java.util.List;

public class Option {
    private List<String> options;
    private int maxOptions;
    private int selectedOption;

    public Option(int maxOptions) {
        this.options = new ArrayList<String>();
        this.maxOptions = maxOptions;
        this.selectedOption = 0;
    }

    public void addOption(String option) {
        if (options.size() < maxOptions) {
            options.add(option);
        }
    }

    public String getOption(int index) {
        if (index >= 0 && index < options.size()) {
            return options.get(index);
        }
        return null;
    }

    public int getSelectedOption() {
        return selectedOption;
    }

    public void setSelectedOption(int selectedOption) {
        if (selectedOption >= 0 && selectedOption < options.size()) {
            this.selectedOption = selectedOption;
        }
    }

    public int getMaxOptions() {
        return maxOptions;
    }

    public void setMaxOptions(int maxOptions) {
        this.maxOptions = maxOptions;
    }
}
