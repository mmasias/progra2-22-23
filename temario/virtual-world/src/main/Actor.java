package main;

public class Actor extends Thread{

    private World world;
    private Room room;
    private String name;

    final int MAX_REPETITIONS = 3;


    public Actor(World world, String name)
    {
        this.world = world;
        this.name = name;
        this.setRoom(0);
    }

    public void setRoom(int roomPosition)
    {
        this.room = world.getRoom(roomPosition);
    }

    private void navigate()
    {
       try {
           sleep( (long) (Math.random() * 100));
       } catch (InterruptedException e) {
           System.err.println(e.getMessage());
       }
    }

    public void run()
    {

        int position;
        int quantity = 0;
        int repetitions = 0;

        while (repetitions < MAX_REPETITIONS){
            this.room.show(this.name);
            this.navigate();
            quantity = (int) (Math.random() * 3);

            for (int i = 0; i < quantity; i++) {
                this.room.remove(this.name);
            }
            this.navigate();

            quantity = (int) (Math.random() * 3);

            for (int i = 0; i < quantity; i++) {
                position = (int) (Math.random() * 100);
                this.room.add(new Stuff(position, position, position), this.name);
            }

            System.out.println("End of cycle of " + this.name);
            repetitions++;
        }
    }


}
