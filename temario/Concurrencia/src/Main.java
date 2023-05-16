public class Main {
    public static void main(String[] args) {

        Concurrente primero, segundo;

        primero = new Concurrente("Hilo1");
        segundo = new Concurrente("Hilo2");

        primero.start();
        segundo.start();


        System.out.println("Main acá termina");
    }
}