package src.classes;

public class UserRepository{
    private static User[] UsersArray;

    private static User[] FAKE_DATA = {
            new User("Pablo", "1234", Roles.AUTHOR),
            new User("Cris", "ykd790", Roles.SUBSCRIBER),
            new User("Gloria", "89678", Roles.SUBSCRIBER),
            new User("vero", "1234", Roles.ADMIN)
    };

    public static void add(String userName, String userPassword, String userRole) {
    }

    public void getInitialFakeData() {
        UsersArray = FAKE_DATA;
    }
    public static User[] get() { return UsersArray; }
    public static User[] add(User user){
        User[] newArray = new User[UsersArray.length + 1];
        for (int i = 0; i < UsersArray.length; i++){
            newArray[i] = UsersArray[i];
        }
        newArray[UsersArray.length] = user;
        UsersArray = newArray;
        return UsersArray;
    }
    public static User[] delete(int id){
        User[] newArray = new User[UsersArray.length - 1];
        for (int i = 0; i < UsersArray.length; i++){
            if (UsersArray[i].getId() != id){
                newArray[i] = UsersArray[i];
            }
        }
        UsersArray = newArray;
        return UsersArray;
    }
    public User[] update(User user, int id){
        for (int i = 0; i < UsersArray.length; i++){
            if (UsersArray[i].getId() == id){
                UsersArray[i] = user;
            }
        }
        return UsersArray;
    }
}
