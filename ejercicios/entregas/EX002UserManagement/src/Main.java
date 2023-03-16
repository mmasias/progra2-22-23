public class Main {
    public static void main(String[] args) {
        User firstUser = new User("", "" );
        Option option1 = new Option(1);
        Manager manager= new Manager(5);

        manager.addUser(firstUser);


        do {
            if (manager.userNameAutentificado(firstUser.getUserNameReal(),firstUser.getUserPasswordReal(), firstUser.getUsername(), firstUser.getUserPassword())== true) {
                option1.createOptionList();
                option1.getOption();
                manager.continueApp(option1.getOption());
                manager.useOptionList(option1.getOption());
                manager.changePassword(firstUser.getUserPassword(), firstUser.getUserPasswordReal());

            }else{
            System.out.println("F");

            }
        }while(manager.continueApp==true || manager.userNameAutentificado==false);










    }
}