public class Main {
    public static void main(String[] args) {

        UserManager manager = new UserManager();

        Admin user1 = new Admin("juan", "123", "Juan Perez");

        MenuOption menu1 = new MenuOption();

        menu1.add("Ver");
        menu1.add("Editar");

        manager.add(user1, menu1);

        RegularUser user2 = new RegularUser("paco34", "567", "Francisco Diaz");

        MenuOption menu2 = new MenuOption(5);

        menu2.add("Ver");
        menu2.add("Editar");
        menu2.add("Eliminar");

        manager.add(user2, menu2);

        manager.isUserAdmin(user1);

        manager.isUserAdmin(user2);

        manager.login("paco34", "567");

        manager.showMenu();



    }
}