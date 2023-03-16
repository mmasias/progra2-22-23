package Classes;

import Classes.Users.Admin;
import Classes.Users.Student;
import Classes.Users.Teacher;
import Classes.Users.User;
import Utils.Enums.Subjects;

public class UserDataBase {
    private final User[] users;

    public UserDataBase() {
        this.users = new User[] {
                new Student("JavierC", Enigma.encrypt("12345"), new int[] {10, 8, 9, 10, 7}),
                new Student("JavierS", Enigma.encrypt("12345"), new int[] {8, 8, 9, 10, 6}),
                new Teacher("jorgercresp", Enigma.encrypt("222333"), Subjects.MATHEMATICS_II),
                new Teacher("breñosa", Enigma.encrypt("123456"), Subjects.LOGIC),
                new Admin("admin", Enigma.encrypt("admin")),
        };
    }
    public User[] getUsers() {
        return this.users;
    }
}
