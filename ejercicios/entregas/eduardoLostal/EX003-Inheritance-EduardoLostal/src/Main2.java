public class Main2 {

    public static void main(String[] args) {

        UserManager manager =new UserManager(3);

        manager.registerUser();

        manager.registerUser();

        manager.authenticate();

    }
}
