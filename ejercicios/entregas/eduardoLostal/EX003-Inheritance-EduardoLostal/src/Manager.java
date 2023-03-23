import java.util.Scanner;

public class Manager {
    int capacity;
    int size;
    User users[];

    MenuOption menus[];

    User currentUser;

    MenuOption currentMenu;

    int selectedOption;
    int selectedIndex;

    Scanner sc = new Scanner(System.in);

    public Manager() {
        this.capacity = 10;
        this.size = 0;
        this.users = new User[capacity];
        this.menus = new MenuOption[capacity];
        this.selectedIndex = -1;
        this.selectedOption = -1;
    }

    public Manager(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.users = new User[capacity];
        this.menus = new MenuOption[capacity];
        this.selectedIndex = -1;
        this.selectedOption = -1;
    }

    public void add(User user,MenuOption menu) {
        if (size < capacity) {
            users[size] = user;
            menus[size] = menu;
            size++;
        }
    }

    public User login(String userName, String password) {
        for (int i = 0; i < size; i++) {
            if (users[i].login(userName, password)) {
                currentUser = users[i];
                selectedIndex = i;
                System.out.println("\nWelcome "+currentUser.getName()+"\n");
                showMenu();
                return currentUser;
            }
        }
        System.out.println("\nInvalid username or password\n");
        return null;
    }

    public void showMenu() {

        boolean start=true;
        while (start==true) {

            System.out.println("--- MENU ---");
            menus[selectedIndex].print();
            System.out.print("\nSelect an option: ");
            selectedOption = sc.nextInt();

            if (selectedOption<1 || selectedOption>menus[selectedIndex].size) {
                System.out.println("\nInvalid Option\n");
            }else {
                menus[selectedIndex].selectOption(selectedOption - 1);
                System.out.println("\nOption " + menus[selectedIndex].getSelectedOption() + " selected\n");
            }
           start=false;
        }
    }


}