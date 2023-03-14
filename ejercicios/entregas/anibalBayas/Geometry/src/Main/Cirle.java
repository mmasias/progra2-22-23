package Main;

public class Cirle {
    private int x_center;
    private int y_center;
    private int radius;
    public static final double PI=3.141592653;
    public  Cirle(int x_center, int y_center, int radius){
        this.x_center = x_center;
        this.y_center = y_center;
        this.radius = radius;
    }

    public void setCenter(int x_center, int y_center){
        this.x_center = x_center;
        this.y_center = y_center;
    }


}
