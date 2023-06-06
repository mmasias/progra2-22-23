import main.Actor;
import main.Stuff;
import main.World;

public class Main {
    public static void main(String[] args)
    {
        int quantity_rooms = 1;
        int quantity_actors = 2;
        World world = new World(quantity_rooms);
        Actor[] actors = new Actor[quantity_actors];

        for (int i = 0; i < quantity_actors; i++) {
            actors[i] = new Actor(world, "Actor" + i);
            actors[i].setRoom((int) (Math.random() * quantity_rooms));
            actors[i].start();
        }
    }
}