
import java.util.Scanner;

public class Manager {

    Scanner sc = new Scanner(System.in);
    private String userNameList;
    public boolean userNameAutentificado;
    private int optionSelected;
    private int maxUsers;
    int numbersofUsers= 0;
    private static User[] User;
    boolean continueApp= true;

    public Manager(int maxUsers) {
        this.userNameList = userNameList;
        this.userNameAutentificado = false;
        this.optionSelected = optionSelected;
        this.maxUsers = maxUsers;
        this.numbersofUsers = 0;
        this.User = new User[maxUsers];


    }

    public String getUserNameList() {
        return userNameList;
    }

    public void setUserNameList(String userNameList) {
        this.userNameList = userNameList;
    }

    public boolean isUserNameAutentificado() {
        return userNameAutentificado;
    }

    public void setUserNameAutentificado(boolean userNameAutentificado) {
        this.userNameAutentificado = userNameAutentificado;
    }

    public int getOptionSelected() {
        return optionSelected;
    }

    public void setOptionSelected(int optionSelected) {
        this.optionSelected = optionSelected;
    }

    public int getMaxUsers() {
        return maxUsers;
    }

    public void setMaxUsers(int maxUsers) {
        this.maxUsers = maxUsers;
    }

    public static User[] getUser() {
        return User;
    }

    public void setUser(User[] user) {
        User = user;
    }


    public boolean userNameAutentificado(String userNameReal, String userPasswordReal, String userName, String userPassword) {
        if (userNameReal ==userName &&  userPasswordReal== userPassword){
            System.out.println("Usuario verificado correctamente");
            userNameAutentificado = true;
            }else{
            System.out.println("Usuario no verificado");
            userNameAutentificado = false;


        }
        return userNameAutentificado;
    }




    public String useOptionList(int option) {
        if (option == 1) {
            System.out.println("Escribe la nueva contraseña");
            String newPassword = sc.nextLine();
            return newPassword;
        } else if (option == 2) {
            System.out.println("Escribe el nuevo nombre");
            String newUsername = sc.nextLine();
            return newUsername;
        } else {

            return null;
        }



    }
    public boolean continueApp(int option){
        if(option==3){
            System.out.println("Se acabó la app");
            continueApp= false;

        }else{
            continueApp=true;
        }
        return continueApp;

    }
    public void changePassword(String newPassword, String userPassword){
        userPassword=newPassword;
    }
    public void addUser(User user){
        if(numbersofUsers < maxUsers)
            User[numbersofUsers] = user;
            numbersofUsers = numbersofUsers + 1;
        }

    }

