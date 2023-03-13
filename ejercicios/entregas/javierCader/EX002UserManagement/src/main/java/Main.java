import Classes.Manager;
import Classes.Menu.MenuItemImpl;
import Classes.Users.Admin;
import Classes.Users.Student;
import Classes.Users.Teacher;
import Classes.Users.User;
import Interfaces.MenuItem;

public class Main {
    public static void main(String args[]) {
        Student student1 = new Student("JavierC", "12345", new int[] {10, 8, 9, 10});
        Student student2 = new Student("JavierS", "12345", new int[] {8, 8, 9, 10});
        Admin elder = new Admin("elderbol", "18910");
        Teacher jorge = new Teacher("jorgercresp", "222333", "Física");

        Manager manager = new Manager(new User[]{student1, student2, elder, jorge});
    }
}
