package main;
public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager(4);
        Option option = new Option();
        User preUser = new User("Jorge","as");
        manager.addUser(preUser);
        System.out.println("WELCOME");
        option.showFirstlOptionList();
        System.out.println("What do you want to do");
        manager.firstOptionSelected();

    }
}