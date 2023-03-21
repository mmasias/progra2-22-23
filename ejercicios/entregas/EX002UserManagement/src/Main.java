public class Main {
    public static void main(String[] args) {


        Option menu1= new Option();

        Manager manager = new Manager();

        menu1.add("registro");
        menu1.add("anular reserva");

        menu1.listar();


        menu1.selectOption(1);




    }




    }