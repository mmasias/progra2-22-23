package main;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Collection<String> carBrands = new ArrayList<String>();
        carBrands.add("Audi");
        carBrands.add("Porsche");
        carBrands.add("Aston Martin");
        carBrands.add("Ferrari");
        carBrands.add("Mercedes");
        carBrands.add("Seat");
        System.out.println("Number of elements before deleting: " +
                carBrands.size());
        System.out.println(carBrands.toString());
        carBrands.remove("Seat");
        carBrands.remove("Mercedes");
        System.out.println("Number of elements after deleting Seat and Mercedes:"
                + carBrands.size());
        System.out.println(carBrands.toString());
        Iterator<String> it = carBrands.iterator();
        for (int i = 0; it.hasNext(); i++) {
            String brand = it.next();
            if (brand.equals("Audi"))
                it.remove();
        }
        System.out.println(carBrands.toString());
    }
}
