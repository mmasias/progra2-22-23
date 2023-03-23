package src.portalWeb;

public class UserManager extends Manager{
    public UserManager(int maxUser) {
        super(maxUser);
    }

    public void registerUser(User user){
        addUser(user);
        System.out.println("Your requests was successful");
    }

    public boolean isAdminUser(User user){
        return user instanceof Admin;
    }

    public void accountModified(String userName, String pass, String passUpdated){
        int maxUser = 50;
        for(int i = 0; i < maxUser; i = i +1){
            if ((User[i] != null) && (User[i].getUserName().equals(userName)) && User[i].getPass().equals(pass)){
                User[i].setPass(passUpdated);
                System.out.println("Password updated successfully");
            }
        }
        System.out.println("Authentication error, incorrect username or password");
    }

    @Override
    public void Menu(){

    }
}
