package Classes.DataBase;

import Classes.Cypher.Enigma;
import Classes.Users.Admin;
import Classes.Users.Student;
import Classes.Users.Teacher;
import Classes.Users.User;
import Utils.Enums.Subjects;

public abstract class UserDataBase {
    private static final User[] users = new User[] {
            new Student("JavierC", Enigma.encrypt("12345"), new int[] {10, 8, 9, 10, 7}),
            new Student("LuciaZ", Enigma.encrypt("12345"), new int[] {8, 8, 9, 10, 6}),
            new Student("CristianR", Enigma.encrypt("12345"), new int[] {9, 6, 7, 8, 6}),
            new Student("AndresA", Enigma.encrypt("12345"), new int[] {9, 10, 7, 5, 6}),
            new Student("VeronikaR", Enigma.encrypt("12345"), new int[] {6, 9, 7, 10, 6}),
            new Student("GabrielS", Enigma.encrypt("12345"), new int[] {5, 8, 7, 7, 10}),
            new Teacher("jorgecrespo", Enigma.encrypt("222333"), Subjects.MATHEMATICS_II),
            new Teacher("jorgecrespont", Enigma.encrypt("222333"), Subjects.DISCRETE_MATHEMATICS),
            new Teacher("breñosa", Enigma.encrypt("123456"), Subjects.LOGIC),
            new Teacher("elderbol", Enigma.encrypt("123456"), Subjects.PROGRAMMING_II),
            new Teacher("luisfanjul", Enigma.encrypt("123456"), Subjects.ICT),
            new Admin("admin", Enigma.encrypt("admin")),
    };

    public static User[] getUsers() {
        return users;
    }
}
