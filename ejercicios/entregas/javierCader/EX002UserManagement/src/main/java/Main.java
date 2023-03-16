import Classes.Enigma;
import Classes.Manager;
import Classes.UserDataBase;

public class Main {
    public static void main(String[] args) {
        new Enigma();
        UserDataBase userDataBase = new UserDataBase();
        new Manager(userDataBase.getUsers());
    }
}
