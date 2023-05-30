package main;

public class World {

    private Room[] rooms;
    private int quantity = 10;

    public World(int quantity) {
        this.rooms = new Room[quantity];

        for (int i = 0; i < quantity; i++) {
            this.rooms[i] = new Room(this.quantity);
        }
    }
    public Room getRoom(int index) {
        return this.rooms[index];
    }
}
