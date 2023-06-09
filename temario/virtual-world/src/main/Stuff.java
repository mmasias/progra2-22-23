package main;

public class Stuff {
    private int x;
    private int y;
    private int z;
    private int id;
    public Stuff(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public boolean greaterThan(Stuff other) {
        boolean isGreater;

      if (this.x > other.x || this.y > other.y || this.z > other.z){
          isGreater = true;
      }
      else {
          isGreater = false;
      }


      return isGreater;
    }

    public String toString() {
        return  "Stuff" + this.id + "(" + this.x + ", " + this.y + ", " + this.z + ")";
    }
}
