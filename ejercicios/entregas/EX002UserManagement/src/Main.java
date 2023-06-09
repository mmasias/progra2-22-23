public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager();

        User user1 = new User("STFaded","123456","Fernando Calvo");

        //user1.setPassword("12345");

        //user1.showUserData();

        Option option1 = new Option();

        //option1.showOptionData();

        option1.addOption("Create");
        option1.addOption("Show");

        //option1.showOptionData();

        manager.addUser(user1,option1);

        User user2 = new User("KLYT","12345","Ángel Rodríguez");
        Option option2 = new Option();

        option2.addOption("Create");

        manager.addUser(user2,option2);

        User user3 = new User("BryanT","1234","Adrián González");
        Option option3 = new Option();

        option3.addOption("Create");
        option3.addOption("Show");
        option3.addOption("Delete");

        manager.addUser(user3,option3);

        manager.userLogin();




    }
}