package main;

public class VectorStuffs {
    private static final int DEFAULT_CAPACITY = 10;
    private int size;
    private Stuff[] stuffs;

    public VectorStuffs() {
        this.stuffs = new Stuff[DEFAULT_CAPACITY];
        this.size = 0;
    }


    public synchronized void show(String who){
        System.out.println(who + " sees (" + this.size + "):");

        for (int i = 0; i < this.size; i++) {
            System.out.println(" " + who + ", " + i + ": " + this.stuffs[i]);
        }
    }

    public synchronized void store(Stuff stuff, String who) {
        boolean found = false;
        int position = 0;

        try {
            while (this.size == this.DEFAULT_CAPACITY){
                System.out.println(who + " is waiting to store...");
                wait();
            }

            System.out.println(who + " is storing " + stuff.getId() + "...");

            while( (position < this.size) && !found){
                if (this.stuffs[position].greaterThan(stuff)){
                    found = true;
                }
                else {
                    position++;
                }

                if ( !found ){
                    this.stuffs[this.size] = stuff;
                }else{
                    for (int i = this.size; i >= position; i--)
                        this.stuffs[i+1] = this.stuffs[i];
                    this.stuffs[position] = stuff;
                }

                this.size++;
                notifyAll();

            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void extract(String who){
        int selected = (int) (Math.random() * this.size);

        try{
            // Can I extract?
            while (this.size == 0){
                System.out.println(who + " is waiting to extract...");
                wait();
            }
            // Delete the selected stuff
            System.out.println(who + " is extracting " + this.stuffs[selected].getId() + "...");
            for (int i = selected+1; i < this.size; i++){
                this.stuffs[i-1] = this.stuffs[i];
            }
            this.size--;
            // All done, notify
            notifyAll();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
