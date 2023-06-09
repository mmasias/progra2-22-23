package main;

public class Room {

    private VectorStuffs contents;
    private int quantity;

    public Room(int capacity) {
        int position = 0;
        this.quantity = 0;
        this.contents = new VectorStuffs();

        for (int i = 0; i < capacity; i++) {
            position = (int) (Math.random() * 100);
            this.add(new Stuff(position, position, position), "");
        }
    }

    public void add(Stuff stuff, String name) {
        this.quantity++;
        stuff.setId(this.quantity);
        this.contents.store(stuff, name);
    }

    public void remove(String name) {
        this.contents.extract(name);
    }

    public void show(String name) {
        this.contents.show(name);
    }
}
