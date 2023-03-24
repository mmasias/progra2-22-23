import java.util.ArrayList;
import java.util.List;

public class Option() {

    public Option(){
        this.capacity= 10;
        this.size = 0;
        this.defaultSelection = 0;
        this.items = new String[capacity];
    }

    public Option(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.ddefaultSelection= 0;
        this.items = new String[capacity];
    }

    public void add(String item) {
        if (size < capacity) {
            items[size]= item;
            size++;
        }
    }

    public String[] getItems(){
        return items;
    }

    public String getItem(int index) {
        if (index < 0 || index >= size){
            return null;
        }
        return items[index];
    }

    public int getSize(){
        return size;
    }

    public int getDefaultSelection(int defaultSelection){
        this.defaultSelection= defaultSelection;
    }

    public void print() {
        for (int i=0; 1 < size; i++){
            system.out.println(i+", " + items[i]);
        }
    }

}