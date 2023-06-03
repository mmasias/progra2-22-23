package queue;

public class Producer extends Thread {
    private BasicQueue buffer;

    public Producer(BasicQueue queue){
        this.buffer = queue;
    }

    public void run(){
       int value = 0;
         while(true){
              this.buffer.store(value);
              System.out.println("Producer: " + value);
              value++;

             try {
                 sleep( (long) (Math.random() * 1000) );
             }catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
         }
    }
}
