package Main;

public class Main {

    public static void main(String[] args) {

    User user = new User("saraPatino", "12345", "Sara");

    user.setUsername("Sara");
    System.out.println("El username es: " + user.getUsername());
    user.setPassword("yoli1234");
    System.out.println("La contraseña es: " + user.getPassword());
    user.setName("SaraPatino");
    System.out.print("El nombre del usuario es: " + user.getName());

    if(user.isAdmin()){
        System.out.println("El usuario es administrador");
    } else {
        System.out.println("El usuario no es administrador");

    }

    UserManager userManager = new UserManager(new User[10], null, new MenuOption[2], 10);
    userManager.registerUser(user);

    if(userManager.isUserAdmin(user)){
        System.out.println("El usuario es administrador");
        } else {
            System.out.println("El usuario no es administrador");
        } 

    String[] options = {
        "login", 
        "register",
        "exit"
    };
    Option option = new Option(options, 0, 3);
    option.addOption("changePassword");
    option.selectOption(2);

    System.out.println("La opción seleccionada es: " + option.getSelectedOption());


    String description1 = "Login";
    MenuOption menuOption = new MenuOption(options, 0, 3, description1);
    System.out.println(menuOption.getDescription(0));
    menuOption.setDescription("Change the password", 3);

    Manager manager= new Manager(new User[10], null, new MenuOption[2], 10);
    manager.addUser(user);
    System.out.println(user);
    manager.showMenu();

    }
    
}
