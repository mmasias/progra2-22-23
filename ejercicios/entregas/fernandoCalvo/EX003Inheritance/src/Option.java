import java.util.ArrayList;
import java.util.Scanner;

public class Option {
    static final int maxOptions = 3;
    ArrayList<String> options;
    private int selectedOption;
    int optionsNumber;

    Scanner sc = new Scanner(System.in);

    //todo Constructor
    Option(int optionsNumber){

        options = new ArrayList<String>();
        selectedOption = -1;
        this.optionsNumber = optionsNumber;
        String opt;

        for(int i=0;i<optionsNumber;i++){

            System.out.print("Introduce the option "+(i+1)+": ");
            opt = sc.nextLine();
            options.add(opt);

        }

        System.out.println("Option menu created");

    }

    public String getSelectedOption() {

        return options.get(selectedOption);

    }

    String getOption(int index){

        return options.get(index);

    }

    void selectOption(int index){

        selectedOption = index;

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