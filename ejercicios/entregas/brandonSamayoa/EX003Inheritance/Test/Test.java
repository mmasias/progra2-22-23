public class Test {
    public static void main(String[] args) {
        // Crear algunos usuarios
        User user1 = new User("user1", "pass1", "John Doe");
        User user2 = new User("user2", "pass2", "Jane Smith");
        Admin admin1 = new Admin("admin1", "adminpass1", "Admin User");
        RegularUser regUser1 = new RegularUser("reguser1", "regpass1", "Regular User");

        // Verificar si un usuario es administrador
        System.out.println("user1 is admin? " + admin1.isUserAdmin(user1)); // false
        System.out.println("admin1 is admin? " + admin1.isUserAdmin(admin1)); // true

        // Agregar algunos usuarios a un UserManager
        UserManager userManager = new UserManager(3);
        userManager.registerUser(user1);
        userManager.registerUser(user2);
        userManager.registerUser(admin1);
        userManager.registerUser(regUser1); // No se puede agregar porque se ha alcanzado el límite

        // Autenticar un usuario
        boolean authenticated = userManager.authenticateUser("user1", "pass1");
        System.out.println("User authenticated? " + authenticated); // true
        System.out.println("Authenticated user: " + userManager.authenticatedUser.getName()); // John Doe

        // Crear algunas opciones de menú
        Option menuOptions = new Option(3);
        menuOptions.addOption("Option 1");
        menuOptions.addOption("Option 2");
        menuOptions.addOption("Option 3");

        // Seleccionar una opción del menú
        menuOptions.selectOption(1);
        System.out.println("Selected option: " + menuOptions.getSelectedOption()); // Option 2

        // Crear una opción de menú con descripción
        MenuOption menuOption = new MenuOption("Exit");
        // Crear un objeto Manager y agregar usuarios
        Manager manager = new Manager(3);
        manager.addUser(user1);
        manager.addUser(user2);
        manager.addUser(admin1);

        // Autenticar un usuario
        authenticated = manager.authenticateUser("admin1", "adminpass1");
        System.out.println("User authenticated? " + authenticated); // true
        System.out.println("Authenticated user: " + manager.getAuthenticatedUser().getName()); // Admin User

        // Mostrar el menú y seleccionar una opción
        manager.showMenu();
        manager.setSelectedOption(menuOption);
        System.out.println("Selected option: " + manager.getSelectedOption().getDescription()); // Exit
    }
}