import Classes.Manager;
import Classes.Menu.MenuItemImpl;
import Classes.Users.Admin;
import Classes.Users.Student;
import Classes.Users.Teacher;
import Classes.Users.User;
import Interfaces.MenuItem;

public class Main {
    public static void main(String args[]) {
        User[] users =  new User[] {
                new Student("JavierC", "12345", new int[] {10, 8, 9, 10}),
                new Student("JavierS", "12345", new int[] {8, 8, 9, 10}),
                new Admin("elderbol", "18910"),
                new Teacher("jorgercresp", "222333", "Física")
        };

        Manager manager = new Manager(users);
    }
}
