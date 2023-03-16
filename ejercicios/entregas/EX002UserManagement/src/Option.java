import java.util.Scanner;
public class Option {
    static Scanner sc = new Scanner(System.in);
    private String optionList;
    private int optionSelected;
    private int optionMax;

    public Option(int optionMax) {
        this.optionList = optionList;
        this.optionMax = optionMax;
        this.optionSelected = optionSelected;

    }

    public String getOptionList() {
        return optionList;
    }

    public void setOptionList(String optionList) {
        this.optionList = optionList;
    }

    public int getOptionSelected() {
        return optionSelected;
    }

    public void setOptionSelected(int optionSelected) {
        this.optionSelected = optionSelected;
    }

    public int getOptionMax() {
        return optionMax;
    }

    public void setOptionMax(int optionMax) {
        this.optionMax = optionMax;
    }

    public void createOptionList() {
        System.out.println("1-Change password");
        System.out.println("2-Change username");
        System.out.println("3-Finish");


    }

    public int getOption() {
        System.out.println("¿Que quieres hacer?");
        int option = sc.nextInt();
        return option;


    }
}
