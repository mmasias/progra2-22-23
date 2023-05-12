public class Concurrente extends Thread {

    public Concurrente(String name){
        super(name);
    }
    public void run(){
        for (int i = 0; i <10; i++){
            System.out.println(i + " - " + this.getName());

            try {
                sleep( (long) (Math.random() * 1000) );
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("He terminado: " + this.getName());
    }
}
