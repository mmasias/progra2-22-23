package project;

public class Option {

    static String optionList = "1-Search users" + "\n" +
            "2-See the FYP page" + "\n" + 
            "3-Last likes you recieved";
    int option;
    int maxOption;

    public Option(int maxOption, int option, String optionList){

        this.maxOption = maxOption;
        this.option = option;
        this.optionList = optionList;

    }

    public static String getOptionList(){
        return optionList;
    }

}
