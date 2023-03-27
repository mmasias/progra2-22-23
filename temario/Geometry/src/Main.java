import com.progra.geometry.Circle;
import com.progra.geometry.ColoredCircle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Circle circle = new Circle(0, 0, 0);
        ColoredCircle coloredCircle = new ColoredCircle(0);

        System.out.println("Circle Magic number: " + circle.getMagicNumber());
        System.out.println("Colored circle magic number: " + coloredCircle.getMagicNumber());
    }
}
