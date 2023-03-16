package geometry;

public class Circle {
    private int x_center;
    private int y_center;
    private int radius;

    private float magicNumber;

    public static final double PI = 3.14159265358979323846;
    public Circle (int x_center, int y_center, int radius){
        this.x_center = x_center;
        this.y_center = y_center;
        this.radius = radius;
    }

    public void setCenter(int x_center, int y_center){
        this.x_center = x_center;
        this.y_center = y_center;
    }

    public int getMagicNumber(int color){
        this.color = color;
    }

}
