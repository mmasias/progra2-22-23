package main;

public class Main {
    public static void main(String[] args) {
        String[] options = {"create", "read", "update", "delete"};
        Option option = new Option(options, 4);
        User user = new User("josue.merino", "abcde", option);
        Manager manager = new Manager(5);

        manager.register(user);

        boolean isUserLogged = manager.login(user);

        if (isUserLogged)
        {
            System.out.println("Bienvenido");
        }
        else {
            System.out.println("Fuera rata");
        }
    }
}