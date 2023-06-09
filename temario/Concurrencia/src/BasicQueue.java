public class BasicQueue {

    private int [] _data;

    private int _nextIn, _nextOut,_size,_used;

    public BasicQueue(int newSize) {
        _data = new int[newSize];
        _size = newSize;
        _used=0;
        _nextIn=1;
        _nextOut=1;

    }

    public synchronized void store(int x){
        try{
            while(_used == _size) wait();
            _data [_nextIn]= x;
            _used++;
        }
        catch (InterruptedException e){

        }
    }
    public synchronized int extract
}
