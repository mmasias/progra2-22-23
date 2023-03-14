import Classes.Manager;
import Classes.UserDataBase;

public class Main {
    public static void main(String[] args) {
        UserDataBase userDataBase = new UserDataBase();
        Manager manager = new Manager(userDataBase.getUsers());
    }
}
