package main;
public class UserManager extends Manager{

    public void registerUser(User user) {
        this.users.add(user);
    }
    public void isUserAdmin(User user) {
        if (user instanceof Admin) {
            System.out.println("You are an admin");
        } else {
            System.out.println("You are not an admin");
        }
    }

}

