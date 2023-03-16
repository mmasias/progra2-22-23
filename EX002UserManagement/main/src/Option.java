import java.util.Scanner;

public class Option {
    String [] options;
    private int optionSelected;
    private int nOptions;

    public Option(String[] options, int optionSelected, int nOptions) {
        this.options = options;
        this.optionSelected = optionSelected;
        this.nOptions = nOptions;
    }
    public Option(int nOptions) {
        this.options = new String[nOptions];
        this.optionSelected = 0;
        this.nOptions = nOptions;
    }
    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public int getOptionSelected() {
        return optionSelected;
    }

    public void setOptionSelected(int optionSelected) {
        this.optionSelected = optionSelected;
    }

    public int getnOptions() {
        return nOptions;
    }

    public void setnOptions(int nOptions) {
        this.nOptions = nOptions;
    }

    public void insert (String opt){
        if (optionSelected < nOptions) {
            options[optionSelected]=opt;
            optionSelected++;
        }
    }

    public void showOptions(){
        for (int i = 0; i <optionSelected ; i++) {
            System.out.println(options[i]);

        }
    }

    public String getOptionByNumber(int number){

        String opt="";
        if (number < optionSelected) {
            opt=options[number];
        }
  return opt;


    }
}
