public class Main {
    public static void main(String[] args) {

        Admin admin1 = new Admin("hola","123","si");

        RegularUser regUser1 = new RegularUser("holi","12345","satan");

        //todo forma 1

        System.out.println(admin1.isAdmin());

        admin1.setAdmin(false);

        System.out.println(admin1.isAdmin());

        //todo forma 2

        String y = admin1.getLogin();

        System.out.println(y);


        Option option1 = new Option(2);

        option1.addOption("Show");
        option1.addOption("Modify");

        option1.listOptions();

    }
}