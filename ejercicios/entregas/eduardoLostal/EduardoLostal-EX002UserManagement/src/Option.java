
public class Option {

    String options[];
    int maxOptions;
   // int optionSelected;
    int storedOptions=0;

    public Option(int maxOptions) {
        options = new String[maxOptions];
        this.maxOptions = maxOptions;
    }

    void addOptions(String newOption){
        if (maxOptions>storedOptions){
            options[storedOptions]=newOption;
            System.out.println("You added a new option "+newOption);
            storedOptions++;
        } else {
            System.out.println("It is impossible to add more options (MAX OPTIONS) "+maxOptions);
        }

    }

    void showOptions(){
        for (int x=0;x<options.length;x++){
            System.out.println("Option "+(x+1)+": "+options[x]);
        }
    }


}
