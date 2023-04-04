package main;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Complex a = new Complex(5.4, -67.0);
        Complex b = new Complex();

        System.out.println("a = " + a + ", " + a.getModulus());
        System.out.println("b = " + b + ", " + b.getModulus());

        if (a.greaterThan(b)) {
            System.out.println("a es mayor que b");
        } else {
            System.out.println("b es mayor que a");




        }


        // Print the list
        ArrayList<Complex> list = new ArrayList<Complex>();
        list.add(a);
        list.add(0, b);

        for (Complex c : list) {
            System.out.println(c);
        }

    }
}