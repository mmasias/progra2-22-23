package project;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("sergiomoreno","abcd","sergio");
        User modificableUser = new User("sergiomoreno","abcd","sergio");

        if(user1.getLogin() == modificableUser.getLogin() && user1.getPassword() == modificableUser.getPassword()){
            System.out.println(Option.getOptionList());
        } else{
            System.out.println("Incorrect user, try it again");
        }




    }
}