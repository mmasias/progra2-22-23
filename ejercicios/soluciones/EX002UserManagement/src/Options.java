package main;
import java.util.Scanner;

public class Options {
    private String[] options;
    private Manager manager;
    private User user;

    public Options(String[] options) {
        this.options = options;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Manager getManager() {
        return this.manager;
    }
    public User getUser() {
        return this.user;
    }

    public void showOptions(){
        System.out.println("1: pizza");
        System.out.println("2: pasta");
        System.out.println("3: salad");
        System.out.println("4: hamburger");
        System.out.println("5: Exit");

    }

    public void getSelectedOption(){
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch (option){
            case 1:
                System.out.println("pizza");
                break;
            case 2:
                System.out.println("pasta");
                break;
            case 3:
                System.out.println("salad");
                break;
            case 4:
                System.out.println("hamburger");
                break;
            case 5:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Wrong option, choose correctly");
                break;
        }
    }
}