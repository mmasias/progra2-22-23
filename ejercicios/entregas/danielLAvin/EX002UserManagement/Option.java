package Codigo;

public class Option {
    private int maxOptions;
    private String[] options;
    private int selectedOption;

    public Option(int maxOptions, String[] options, int selectedOption) {
        this.maxOptions = maxOptions;
        this.options = new String[maxOptions];
        this.selectedOption = selectedOption;
    }

    public int getMaxOptions() {
        return maxOptions;
    }

    public void setMaxOptions(int maxOptions) {
        this.maxOptions = maxOptions;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public int getSelectedOption() {
        return selectedOption;
    }

    public void setSelectedOption(int selectedOption) {
        this.selectedOption = selectedOption;
    }
    public void addOption(String opt){
        if (selectedOption<maxOptions){
            this.options[selectedOption]=opt;
            selectedOption++;
        }
    }
    public void showMenu(String[] options){
        for (int i = 0; i < selectedOption; i++) {
            System.out.println(options[i]);
        }
    }
    public String showOption(int choosenOpt){
        String temp="";
        if (choosenOpt<selectedOption){
            temp=options[choosenOpt];
        }
        return temp;
    }
}
