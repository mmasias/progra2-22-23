import java.util.ArrayList;

public class Option {
    static final int maxOptions = 2;
    ArrayList<String> options;
    private int selectedOption;

    //todo Constructor
    Option(){

        options = new ArrayList<String>();
        selectedOption = 0;

        System.out.println("Option menu created");

    }

    public int getSelectedOption() {

        return selectedOption;

    }

    public void setSelectedOption(int selectedOption) {

        this.selectedOption = selectedOption;

    }

    public void addOption(String option){

        if(options.size()==maxOptions){

            System.out.println("Unable to add an option. Max Options: "+maxOptions);

        }else{

            options.add(option);
            System.out.println("An option has been added to the menu.");

        }

    }

    public void listOptions(){

        System.out.println("User Options: ");

        for(int i=0;i<options.size();i++){

            System.out.println((i+1)+" - "+options.get(i));

        }

    }

    public void showOptionData(){

        System.out.println("The Maximum Options are: "+maxOptions);
        System.out.println("The Selected Option is: "+selectedOption);

        //todo ListOptions

        listOptions();

    }

}
