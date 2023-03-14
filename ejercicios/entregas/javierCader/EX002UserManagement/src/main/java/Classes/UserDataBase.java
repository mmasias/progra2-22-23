package Classes;

import Classes.Users.Admin;
import Classes.Users.Student;
import Classes.Users.Teacher;
import Classes.Users.User;

public class UserDataBase {
    private final User[] users;

    public UserDataBase() {
        this.users = new User[] {
                new Student("JavierC", "12345", new int[] {10, 8, 9, 10}),
                new Student("JavierS", "12345", new int[] {8, 8, 9, 10}),
                new Teacher("jorgercresp", "222333", "Física"),
                new Admin("admin", "admin"),
        };
    }
    public User[] getUsers() {
        return this.users;
    }
}
