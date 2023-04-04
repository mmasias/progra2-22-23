package main;
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        Collection<String> carsBrandsList = new ArrayList<String>();
        carsBrandsList.add("Audi");
        carsBrandsList.add("Porsche");
        carsBrandsList.add("Aston Martin");
        carsBrandsList.add("Ferrari");
        carsBrandsList.add("Mercedes");
        carsBrandsList.add("Seat");


        System.out.println("Number of elements before delete: " + carsBrandsList.size());

        System.out.println(carsBrandsList.toString());


        carsBrandsList.remove("Seat");
        carsBrandsList.remove("Mercedes");

        System.out.println(
                "Number of elements after delete of Seat and Mercedes:" + carsBrandsList.size()
        );

        System.out.println(carsBrandsList.toString());

        Iterador<String> it = carsBrandsList.iterator();
        for (int i=0; it.hasNext(); i++){
            String brand = it.next();
            if(brand.equals("Audi"))
                it.remove();
        }

        System.out.println(carsBrandsList.toString());
    }

}