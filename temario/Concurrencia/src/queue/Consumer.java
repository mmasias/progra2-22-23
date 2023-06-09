package queue;

public class Consumer extends Thread {

    private BasicQueue buffer;
    private int id;

    public Consumer(BasicQueue queue, int id){
        this.buffer = queue;
        this.id = id;
    }

    public void run(){
        int value = 0;
        while(true){
            value = this.buffer.extract();
            System.out.println("[" + this.id + "] Consumer: " + value);

            try {
                sleep( (long) (Math.random() * 1000) );
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
