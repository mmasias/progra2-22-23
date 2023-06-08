package queue;

public class BasicQueue {
    private int [] data;
    private int nextIn, nextOut, size, used;

    public BasicQueue(int Size){
        this.data = new int [Size];
        this.size = Size;
        this.used = 0;
        this.nextIn = 1;
        this.nextOut = 1;
    }

    public synchronized void store(int value){
        try{
            while(this.used == this.size) wait() ; // full => wait for space
            this.data[this.nextIn] = value;
            this.nextIn = (this.nextIn + 1) % size;
            this.used++;
            this.notifyAll(); // notify waiting threads
        }
        catch (InterruptedException e){
            System.err.println("Error in store: " + e.getMessage());
        }
    }
    public synchronized int extract(){
        int value = 0;
        try{
            while(this.used == 0) wait(); // no data => wait
            value = this.data[this.nextOut];
            this.nextOut = (this.nextOut + 1) % size;
            this.used--;
            notifyAll(); // notify waiting threads
        }
        catch(InterruptedException e ){
            System.err.println("Error in extract: " + e.getMessage());
        }
        return value;
    }
}

