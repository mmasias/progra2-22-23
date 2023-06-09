

class Main {

    public static void main(String[] args) {
        Manager gestion = new Manager(5);

        Options menu1 = new Options(3);

        menu1.addOption("opcion 1");
        menu1.addOption("opcion 2");
        menu1.addOption("opcion 3");

        Options menu2 = new Options(3);

        menu2.addOption("opcion 4");
        menu2.addOption("opcion 5");
        menu2.addOption("opcion 6");

        Users user1 = new Users("Juan Jimenez", "JuanJ", "72302", menu1);

        Users user2 = new Users("Alvaro Gonzalez", "AlvaroGonza", "32567", menu2);

        gestion.addUsers(user1);
        gestion.addUsers(user2);

        Users user  = gestion.AuthenticatesUser("JuanJ", "72302");

        if(user != null){
            System.out.println("logueado exitosamente");
            System.out.println(user.myOpcions().options);
        }else {
            System.out.println("autenticacion fallida");
        }
    }
}