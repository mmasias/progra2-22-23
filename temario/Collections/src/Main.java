import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Collection<String> carBrandsList = new ArrayList<>();
        carBrandsList.add("Audi");
        carBrandsList.add("Porsche");
        carBrandsList.add("Aston Martin");
        carBrandsList.add("Ferrari");
        carBrandsList.add("Mercedes");
        carBrandsList.add("Seat");

        System.out.println("Elements size before clean-up" + carBrandsList.size());
        System.out.println(carBrandsList.toString());

        carBrandsList.remove("Seat");
        carBrandsList.remove("Mercedes");

        System.out.println("Elements size before deletion of Seat and Mercedes" + carBrandsList.size());
        System.out.println(carBrandsList.toString());

        Iterator<String> it = carBrandsList.iterator();

        for (int i=0; it.hasNext();i++){
            String brand = it.next();
            if(brand.equals("Audi"))
                it.remove();
        }

        System.out.println(carBrandsList.toString());

    }
}